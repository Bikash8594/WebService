package in.nit.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

@Path("/ctx")
public class ContextRestController {
	@POST
	public String getData(
			@Context HttpHeaders header,
			@Context ResourceInfo info,
			@Context UriInfo uri
			              ) {
		System.out.println(header.getMediaType());
		System.out.println(header.getHeaderString("auth"));
		System.out.println(header.getLength());
		System.out.println(header.getCookies());
		
		System.out.println(info.getResourceMethod());
		System.out.println(info.getClass());
		
		System.out.println(uri.getAbsolutePath());
		System.out.println(uri.getPath());
		System.out.println(uri.getBaseUri());
		
		return "done";
	}

	
}
