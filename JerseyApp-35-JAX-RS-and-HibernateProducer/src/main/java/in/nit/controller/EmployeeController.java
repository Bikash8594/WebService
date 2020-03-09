package in.nit.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import in.nit.model.Employee;
import in.nit.resp.ErrorResponse;
import in.nit.service.IEmployeeService;

@Path("/emp")
public class EmployeeController {
	@Inject
	private IEmployeeService service;
	@GET
	@Produces("application/json")
	public Response showAllEmployees() {
		Response resp=null;
		try {
			List<Employee> list=service.getAllEmployee();
			if(list==null || list.isEmpty()) {
				resp=Response.status(200).entity(new ErrorResponse("No Data","No Record Found in producer side"))
						     .build();
			}
			else{
				resp=Response.status(200).entity(list).build();	
				}
			
		} catch (Exception e) {
			resp=Response.status(500).entity(e.getMessage()).build();
			e.printStackTrace();
		}
		return resp;	
	}
	
	@POST
	@Consumes("application/json")
	public Response saveEmployee(Employee e) {
		Response resp=null;
		try {
			Integer id=service.saveEmployee(e);
			resp=Response.status(200).entity(new StringBuffer()
					.append("saved With Id").append(id).toString()).build();
			
		} catch (Exception ex) {
			resp=Response.status(500).entity(ex.getMessage()).build();
			ex.printStackTrace();
		}
		return resp;
		
	}

}
