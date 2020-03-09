package in.nit.controller;


import java.util.StringTokenizer;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.codec.binary.Base64;

@Path("/secure")
public class SecureRestController {
	@GET
	public Response validate(
			@HeaderParam("Authorization")String auth) {
		Response resp=null;
		System.out.println(auth);

		//Auth is null or empty
		if(auth==null || "".equals(auth.trim()))
			return Response.ok().status(Status.BAD_REQUEST).entity("No Authentication provided").build();

		//Remove Basic Space
		auth=auth.replaceAll("Basic","");
		System.out.println(auth);

		//Decode Auth
		byte[]arr=Base64.decodeBase64(auth.getBytes());
		auth=new String(arr);
		System.out.println(auth);

		//Tokenisizer auth
		StringTokenizer str=new StringTokenizer(auth, ":");
		String Un=str.nextToken();
		String pwd=str.nextToken();

		//validate logic
		if(!("admin".equals(Un) && "nit".equals(pwd))) {
			return Response.ok().entity("Invalid Un/Pwd").status(Status.UNAUTHORIZED).build();
		}
		/*resp=Response.ok().entity("WElcome to App").status(Status.OK).build();
		*/
		resp=Response.ok("Welcome To App").build();
		return resp;
	}

}
