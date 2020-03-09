package in.nit.controller;

import javax.annotation.security.DenyAll;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("paytm")
public class PaytmRestController {
	@GET
	@Path("/all")
	@PermitAll
	public String showAll() {
		return "WElcome To All" ;
	}
	
	@GET
	@Path("/none")
	@DenyAll
	public String showNone() {
		return "Any one not Allowed" ;
	}
	@GET
	@Path("/adm")
	@RolesAllowed("ADMIN")
	public String showAdmin() {
		return "welcome to Admin" ;
	}
	@GET
	@Path("/ven")
	@RolesAllowed({"ADMIN","CUST"})
	public String showVen() {
		return "Welcome to vender" ;
	}



}
