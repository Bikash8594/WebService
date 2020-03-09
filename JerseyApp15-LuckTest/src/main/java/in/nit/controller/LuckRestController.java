package in.nit.controller;

import java.util.Random;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/luck")
public class LuckRestController {

	@POST
	public String getMsg(
		@FormParam("num") int num) {
		String msg=null;
		int rand=new Random().nextInt(9);
		if(num==rand)
			msg="Congrats u won 1l";
		else
			msg="Better Luck Next Time !";
		return msg;
	}
	
	}


