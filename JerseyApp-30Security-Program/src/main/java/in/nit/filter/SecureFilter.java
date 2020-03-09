package in.nit.filter;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;


public class SecureFilter implements ContainerRequestFilter {
	@Context
	private ResourceInfo info;
	@Context
	private HttpHeaders header;


	public void filter(ContainerRequestContext req) throws IOException {

		Method method=info.getResourceMethod();
		if(!method.isAnnotationPresent(PermitAll.class) ) {
			if(method.isAnnotationPresent(DenyAll.class) ) {
				req.abortWith(Response.status(Status.FORBIDDEN).entity("You cant acess").build());
				return;
			}//end of deny

			if(method.isAnnotationPresent(RolesAllowed.class)) {
				List<String>list=header.getRequestHeader("Authorization");
				//if auth is null or empty-400
				if(list==null || list.isEmpty()) {
					req.abortWith(Response.status(Status.BAD_REQUEST).entity("No Authorization found").build());
					return;
				}
				//auth is not empty or null
				String auth=list.get(0);
				String user=null;
				String pwd=null;
				try {
					//Remove Basic<Space>
					auth=auth.replaceAll("Basic ", "");
					//Decode Auth
					byte[]arr=Base64.getDecoder().decode(auth);
					auth=new String(arr);
					//split un,pwd 
					String[] sec=auth.split(":");   
					user=sec[0];   
					pwd=sec[1];    
					System.out.println("Good work");  
					System.out.println(user);   
					System.out.println(pwd);   
				} catch (Exception e) {
					e.printStackTrace();  
					req.abortWith(Response.status(Status.INTERNAL_SERVER_ERROR).entity("Unable to get user/pwd from Auth Header").build());
					return;
				}//catch
				//validateUser  
				boolean flag=validateUser(user, pwd);  
				if(!flag) {
					//not a vaild user  
					req.abortWith(Response .status(Status.UNAUTHORIZED).entity("user/password is invaild").build()); 
					return;
				}
				//validate Role 
				String[] rolesArray=method.getAnnotation(RolesAllowed.class).value();  
				List<String> rolesAtMethod=Arrays.asList(rolesArray);  
				flag=validateRole(user, rolesAtMethod);  
				if(!flag) {      
					req.abortWith(Response.status(Status.FORBIDDEN).entity("USER HAS INVAILD ROLE").build());
					return;
				}
			}


		}//security
	}//filter

	private boolean validateUser(String user, String pwd) {
		boolean flag=false;
		//sam-nit-ADMIN  
		if("sam".equals(user) && "nit".equals(pwd)) { 
			flag=true;  
		}else if("khan".equals(user) && "xyz".equals(pwd)) {  
			//khan-xyz-ADMIN,CUST 
			flag=true; 
		}else if("ram".equals(user) && "abc".equals(pwd)) {  
			//ram-abc-CUST   
			flag=true; 
		}  
		return flag;  
	} 

	private boolean validateRole(String user,List<String> rolesAtMethod) {  
		boolean flag=false;  
		//DB:sam-nit-ADMIN 
		if("sam".equals(user) && rolesAtMethod.contains("ADMIN")) {  
			flag=true;  
		}else if("khan".equals(user) && (rolesAtMethod.contains("ADMIN")||rolesAtMethod.contains("CUST"))) {  
			//khan-xyz-ADMIN,CUST
			flag=true;
		}else if("ram".equals(user) && rolesAtMethod.contains("CUST")) { 
			//ram-abc-CUST
			flag=true; 
		}
		return flag;
	}

}
