package in.nit.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Customber;

@Path("/mm")
public class CustomberRestController {

	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public String saveController(Customber c) {
	return c.toString();
	}
}
