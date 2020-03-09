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


public class SecurityFilter implements ContainerRequestFilter {

	/*public void filter(ContainerRequestContext req) throws IOException {
		System.out.println("From filter");
		
		req.abortWith(Response.status(Status.BAD_REQUEST).entity("Not Auth Found").build());
		return;
	}
		
		 req.abortWith(Response.status(Status.UNAUTHORIZED).entity("Not a valid user/pwd").build());
		return;
	}
		 req.abortWith(Response.status(Status.FORBIDDEN).entity("Invalid Role").build());
		return;
	}*/
		
		
		
		
		
		
		
	@Context
	private HttpHeaders header;
	@Context
	private ResourceInfo info;
	public void filter(ContainerRequestContext req) throws IOException {
	
		System.out.println("=========From filter==========");
		System.out.println(info.getResourceClass());
		System.out.println(info.getResourceMethod());
		
		//current Request java method data 
		Method m=info.getResourceMethod();
		System.out.println("permitAll->"+m.isAnnotationPresent(PermitAll.class));
		System.out.println("DenyAll"+m.isAnnotationPresent(DenyAll.class));
		System.out.println("RolesAllowed"+m.isAnnotationPresent(RolesAllowed.class));
		
		//Read Authorization Header param
		List<String>list=header.getRequestHeader("authorization");
		String auth=list.get(0);
		System.out.println("HeaderParam"+auth);
		
		//Remove Basic<Space>from auth String
		auth=auth.replaceAll("Basic","");
		
		//Decode using Jdk 8- Base64
		byte[]arr=Base64.getDecoder().decode(auth);
		
		auth=new String (arr);
		System.out.println("After Decode:"+auth);
		
		//Read un/pwd using split method
		String[] authArr=auth.split(":");
		String user=authArr[0];
		String pwd=authArr[1];
		System.out.println("user:"+user);
		System.out.println("pwd:"+pwd);
		
		Method m1=info.getResourceMethod();
		if(m1.isAnnotationPresent(RolesAllowed.class)) {
			//read method level roles
			String []arr1=m.getAnnotation(
					RolesAllowed.class).value();
			System.out.println(Arrays.asList(arr1));
		}else {
			System.out.println("may be permitAll/DenyAll");				
		}
	}
	
	
	
	

} 
