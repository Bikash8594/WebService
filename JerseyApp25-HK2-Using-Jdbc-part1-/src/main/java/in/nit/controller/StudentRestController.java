package in.nit.controller;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import in.nit.model.Student;
import in.nit.service.IStudentService;

@Path("/std")
public class StudentRestController {
	@Inject
	private IStudentService service;
	@POST
	@Consumes("application/json")
	public Response save(Student s) {
		Response resp=null;
		try {
		int count=service.saveStudent(s);
		if(count==1)
			 resp=Response.ok("Success insert").build();
		else
			resp=Response.ok().entity("Problem found").status(Status.BAD_REQUEST).build();
		}catch (Exception e) {
			resp=Response.ok().entity(e.getMessage()).status(Status.INTERNAL_SERVER_ERROR).build();
		
		e.printStackTrace();
		}
		return resp;
		
		
		}

}
