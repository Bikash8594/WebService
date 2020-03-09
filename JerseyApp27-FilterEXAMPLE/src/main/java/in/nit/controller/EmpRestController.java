package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class EmpRestController {

	@GET
	public String show() {
		System.out.println("From Producer");
		return "hello";
	}
}
