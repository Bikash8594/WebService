package in.nit;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

public class ClientTest {

	private static String uri="http://localhost:3030/JerseyApp14-FormParam/";
	private static String path="rest/card/pay";

	public static void main(String[] args) {
		Form f=new Form();
		f.param("cname", "bikash");
		f.param("cnum", "9634");
		f.param("cvv", "1234");
		f.param("amt", "99.99");
		f.param("dte", "05/30");
		try {
		Response resp=	ClientBuilder.newClient()
			.target(uri).path(path)
			.request().post(Entity.form(f));
			System.out.println(resp.getStatus());
			System.out.println(resp.getStatusInfo());
			System.out.println(resp.readEntity(String.class));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
