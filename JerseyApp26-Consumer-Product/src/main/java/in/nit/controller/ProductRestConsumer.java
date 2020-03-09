package in.nit.controller;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import in.nit.model.Product;


public class ProductRestConsumer {
	public static String saveProduct(Product p) {
		 String uri="http://localhost:3030/JerseyApp26-Producer-Product";
		 String out=null;
		try {
			Client c=ClientBuilder.newClient();
			WebTarget wt=	c.target(uri).path("/rest/product/save");
			Builder builder=wt.request();
			Response resp=builder.post(Entity.json(p));
			 out=resp.readEntity(String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return out;
	}
}
