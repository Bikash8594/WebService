package in.nit.test;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;

import in.nit.model.Customber;


public class ClientTest {
	
	private static String uri="http://localhost:3030/ProducerApp7-customber";
	private static String path="/rest/mm";

	public static void main(String[] args) {
		try {
			Customber ob=new Customber();
			ob.setCid(1);
			ob.setCname("Bikash");
			ob.setType("hhhhhh");
			
			Response resp= ClientBuilder.
					newClient().
					target(uri).
					path(path).
					request().
					post(Entity.json(ob));
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));
									
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
