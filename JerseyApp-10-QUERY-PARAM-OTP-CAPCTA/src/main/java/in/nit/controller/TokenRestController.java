package in.nit.controller;

import java.util.Random;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/token")
public class TokenRestController {
	
	@GET
	public String getToken(
			@QueryParam("type")String type,
			@QueryParam("size")int size) {
		String result=null;
		if(size <= 0) {
			result="INVALID SIZE";
		}else if("otp".equals(type)) {
			Random r=new Random();
			while(true) {
				//fix max number range
				int maxRange=(int)Math.pow(10, size)-1;
				//generate random number
				int c=r.nextInt(maxRange);
				c=Math.abs(c);
				//convert int to String format 
				result=String.valueOf(c);
				//generate number length is 4
				if(result.length()==size)break;
			}
			}else if("Capcta".equals(type)) {
				result=UUID.randomUUID().toString()
			.replaceAll("-","").toUpperCase()
			.substring(0, size);
		}else {
			return "INVALID TYPE";
		}
		return result;
	}

}
