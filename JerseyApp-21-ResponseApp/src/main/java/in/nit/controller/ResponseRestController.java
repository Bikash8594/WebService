package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

@Path("/resp")
public class ResponseRestController {
	@GET
	@Path("/unauth")
	public Response showAuth() {
		ResponseBuilder rb=Response.ok();
		rb.status(Status.UNAUTHORIZED);
		rb.entity("Invalid Un/pwd");
			Response resp=rb.build();
		return resp;
	}
	@GET
	@Path("/empty")
	public Response emptyCheck() {
		return Response.ok()
				.entity("Empty Un/Pwd")
				.status(Status.BAD_REQUEST)
				.build();
	}
		
	

}
