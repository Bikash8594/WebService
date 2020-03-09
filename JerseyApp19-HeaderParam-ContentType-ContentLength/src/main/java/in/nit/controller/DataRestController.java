package in.nit.controller;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/data")
public class DataRestController {
	@POST
	public String showData(
			@HeaderParam("Content-Type")String dt,
			@HeaderParam("Content-Length")int len
			) {
		System.out.println(dt+","+len);
		return "done";		
	}

}
