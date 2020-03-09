package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import in.nit.filter.MyReqFilter;
import in.nit.filter.MyResFilter;
@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {
	public AppConfig() {
			packages("in.nit.controller");
			register(MyReqFilter.class);
			register(MyResFilter.class);
	
	}

}
