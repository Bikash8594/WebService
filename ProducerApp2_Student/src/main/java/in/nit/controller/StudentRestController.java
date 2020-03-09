package in.nit.controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import in.nit.model.Student;

@Path("/student")

public class StudentRestController {
	
@GET
@Produces(MediaType.APPLICATION_JSON)
	public Student showStudent() {
	Student s=new Student();
	HashMap<String, Integer> h=new HashMap<String, Integer>();
	h.put("a", 1);
	h.put("b", 2);
	h.put("c", 6);
	s.setSid(1);s.setSname("Bikash");s.setSfee(20.2);
	s.setSubject(Arrays.asList("a","b","c"));
	s.setMark(h);
		return s;
		
	}

}
