package in.nit.controller;

import javax.ws.rs.QueryParam;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

public class ClientTest {

	private static String uri="http://localhost:3030/JerseyApp-10-QUERY-PARAM/";
	private static String path="/rest/emp/mm";

	public static void main(String[] args) {
		Response resp=ClientBuilder.newClient()
				.target(uri).path(path).
				queryParam("eid", 10)
				.queryParam("ename","Bikash")
				.queryParam("branch","bobal")
				.request()
				.get();
		System.out.println(resp.getStatus());
		System.out.println(resp.getStatusInfo());
		System.out.println(resp.readEntity(String.class));
				
				

	}

}
