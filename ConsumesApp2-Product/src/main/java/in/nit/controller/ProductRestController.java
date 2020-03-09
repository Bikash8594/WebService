package in.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import in.nit.model.Product;

@Path("/product")
public class ProductRestController {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String save(Product p) {
		return p.toString();
		
	}
}
