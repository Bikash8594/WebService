package in.nit.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import in.nit.service.IService;

@Path("/emp")
public class EmpRestController {
	@Inject
	private IService service;
	
	@GET
	public String showMsg() {
		String msg=service.saveEmp();
		return "From Producer" +msg;
		
	}

}
