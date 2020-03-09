package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/emp")
public class EmpRestController {
	@GET
	@Path("/data/{id}/{name}/{sal}")
	public String showMsg(
			@PathParam("id")int eid,
			@PathParam("name")String ename,
			@PathParam("sal")double esal
			) {
				return "hello:"+eid +"," +ename +","+esal;
		
	}

}
