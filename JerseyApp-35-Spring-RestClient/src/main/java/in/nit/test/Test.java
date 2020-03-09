package in.nit.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import in.nit.model.Employee;


public class Test {

	public static void main(String[] args) {
		/*
		 * //for GET Method String url=
		 * "http://localhost:3030/JerseyApp-35-JAX-RS-and-HibernateProducer/rest/emp";
		 * RestTemplate rt=new RestTemplate(); Employee[]
		 * arr=rt.getForObject(url,Employee[].class);
		 * List<Employee>emps=Arrays.asList(arr); emps.forEach(System.out::println);
		 */
		
		//for POST method
		String url="http://localhost:3030/JerseyApp-35-JAX-RS-and-HibernateProducer/rest/emp";
		RestTemplate rt=new RestTemplate();
		Employee e=new Employee();
		e.setEmpName("nnnnn");
		e.setEmpSal(20.0);
		String msg=rt.postForObject(url,e,String.class);
		System.out.println(msg);

	}

}
