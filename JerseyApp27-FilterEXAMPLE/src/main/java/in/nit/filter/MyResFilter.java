package in.nit.filter;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class MyResFilter implements ContainerResponseFilter {

	public void filter(ContainerRequestContext req, ContainerResponseContext resp)
			throws IOException {
		System.out.println("From Resp Filter");

	}

}
