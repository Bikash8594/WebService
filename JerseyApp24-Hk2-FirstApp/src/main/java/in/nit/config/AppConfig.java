package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.nit.service.IService;
import in.nit.service.impl.ServiceImpl;

@ApplicationPath("/rest")
public class AppConfig  extends ResourceConfig {
	public AppConfig() {
 packages("in.nit.controller");
 register(new AbstractBinder() {
	
	@Override
	protected void configure() {
		bind(ServiceImpl.class).to(IService.class);
	}
});
	}
}
