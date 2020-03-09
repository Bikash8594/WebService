package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import in.nit.controller.UserVerificationFilter;

@ApplicationPath("/rest") 
	public class AppConfig   extends ResourceConfig { 

		public AppConfig() {  
			packages("in.nit.controller"); 
			register(UserVerificationFilter.class); 
		}

		}
