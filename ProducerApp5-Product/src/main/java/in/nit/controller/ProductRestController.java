package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Product;

@Path("/product")
public class ProductRestController {

	
	@GET
	@Path("/view")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
	public Product showProduct() {
		return new Product(10,"Bb",2.2);		
	}
}
