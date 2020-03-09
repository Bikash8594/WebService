package in.nit.controller;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.hk2.api.Immediate;
import org.glassfish.jersey.process.internal.RequestScoped;

@Path("/emp")
//@RequestScoped
@Singleton
//@Immediate
public class EmployeeRestController {
	public EmployeeRestController() {
		System.out.println("object created");
	}
	@GET
	public String getShow() {
		return "Hiiii!";
	}

}
