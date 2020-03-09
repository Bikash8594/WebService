package in.nit.controller;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Address;
import in.nit.model.Student;

@Path("/student")
public class StudentRestController {

	@GET
	@Path("/one")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStd() {
		Address a = new Address();
		a.setHno("0hj32");
		a.setLoc("hyd");
		Student s = new Student();
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("phy", 1);
		m.put("math", 22);
		m.put("Eng", 2);
		s.setSid(1);
		s.setSname("bikash");
		s.setSubject(Arrays.asList("Eng", "Math", "phy"));
		s.setMark(m);
		s.setAddrs(a);
		return s;
	}
	
		@GET
	  @Path("/two")
	 // @Produces(MediaType.APPLICATION_JSON)
	  public void show() {
	  System.out.println("StudentRestController.show()");
	  }
	  
		@GET
	  @Path("/three")
	  @Produces(MediaType.APPLICATION_JSON)
	  public java.util.List<String> ShowList(){ 
			return Arrays.asList("A","B","C","D");
			
		}
	 }
