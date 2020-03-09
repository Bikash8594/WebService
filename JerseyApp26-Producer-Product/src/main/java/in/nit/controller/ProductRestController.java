package in.nit.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import in.nit.model.Product;
import in.nit.service.IProductService;

@Path("/product")
public class ProductRestController {

	@Inject
	private IProductService service ;
	@POST
	@Path("/save")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Response saveProduct(Product p) {
		Response resp=null;
		try {
			//cal service
			int count=service.saveProduct(p);
			if(count==1)
				return resp.ok("Successfully created").build();
			else
				return resp.ok().status(Status.BAD_REQUEST).entity("NOt created").build();
		} catch (Exception e) {
			resp.ok().status(Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		 e.printStackTrace();
		}
		return resp;
	}
	@GET 
	@Path("/all") 
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) 
	public List<Product> getAllProducts() {  
		List<Product> list= service.getAllProducts(); 
		return list;
	}
}


