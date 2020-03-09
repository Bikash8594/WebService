package in.nit.controller;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

@Path("/emp")
public class EmpRestController {
	
	@GET
	public String fetchEmployeeData() {
		return "fetch   data to emp tb"; 
	}
	
	@PUT
	public String modifyEmployeeData() {
		return "modify data to emp tb"; 
	}
	
	@DELETE
	public String RemoveEmployee() {
		return "Delete data to emp tb"; 
	}
	@POST
	public String saveEmployee() {
		return " save data to emp tb"; 
	}
	

}
