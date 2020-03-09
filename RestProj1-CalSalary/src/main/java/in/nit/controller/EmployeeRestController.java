package in.nit.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Employee;
import in.nit.model.salaryInfo;

@Path("/employee")
public class EmployeeRestController {
	
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public salaryInfo processSal(Employee e) {
		
		double basic=e.getBasicSal();
		double hra=basic*5/100.0;
		double ta=basic*2/100.0;
		double da=basic*3/100.0;
		double tax=basic*6/100.0;
		double net=basic+hra+ta+da-tax;

		salaryInfo s=new salaryInfo();
		s.setEname(e.getEname());
		s.setBasic(basic);
		s.setHra(hra);
		s.setDa(da);
		s.setTa(ta);
		s.setTax(tax);
		s.setNet(net);
		return s;
		
		
	}

}
