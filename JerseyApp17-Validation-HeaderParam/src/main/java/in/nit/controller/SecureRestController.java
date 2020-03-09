package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

@Path("/secure")
public class SecureRestController {
	@GET
	public String varifyAndProcess(
			@HeaderParam("userId")String uid,
			@HeaderParam("pwd")String pwd) {
		String msg=null;
		//null or Empty validation
		if(uid==null || "".equals(uid.trim())) 
			msg="Empty client provided";
		else if(pwd==null || "".equals(pwd.trim())) 
			msg="Empty password provided";
		else if("123".equals(uid)&& "abc".equals(pwd))
			msg="LOG IN SUCCESSFULL !";
		else
			msg="Un Authorised User";
		
		return msg;
	}

}
