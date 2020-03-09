package in.nit.test;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;



public class ClientTest {

	private static String uri="http://localhost:3030/JerseyApp17-Validation-HeaderParam";
	private static String path="/rest/secure";

	public static void main(String[] args) {
		try {
			Client c=ClientBuilder.newClient();
			WebTarget wt=c.target(uri).path(path);
			Builder builder =wt.request();
			Response resp=	builder.header("userId", "123").header("pwd", "abc")
					.get();
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
