package in.nit.controller;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/prod")
public class ProductController {
	@GET
	@Path("/all")
	@PermitAll
	public String viewAll() {
		return "Welcome to All";
		}
	@GET
	@Path("/none")
	@DenyAll
	public String viewNone() {
		return "Welcome to None";
		}
	
	@GET
	@Path("/adm")
	@RolesAllowed("ADMIN")
	public String viewAdmin() {
		return "Welcome to Admin";
		}
	@GET
	@Path("/msg")
	@RolesAllowed({"ADMIN","CUST"})
	public String viewPerson() {
		return "Welcome to All";
		}
	

}
