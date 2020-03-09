package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Address;
import in.nit.model.Customber;

@Path("/customber")
public class CustomberRestController {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Customber findData() {
		Address a=new Address();
		a.setAid(1);
		a.setLoc("hyd");
		Customber c=new Customber();
		c.setCid(2);
		c.setCname("Bikash");
		
		c.setBill(23.0f);
		c.setAddrs(a);
		return c ;
		
	}
	
	

}
