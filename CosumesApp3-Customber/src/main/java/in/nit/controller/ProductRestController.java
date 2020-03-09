package in.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import in.nit.model.Customber;

@Path("/product")
public class ProductRestController {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String saveProduct(Customber p) {
		return p.toString();
	}

}
