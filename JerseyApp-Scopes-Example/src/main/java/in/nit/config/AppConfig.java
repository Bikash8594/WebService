package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.jersey.server.ResourceConfig;
@ApplicationPath("/rest")
public class AppConfig  extends ResourceConfig{

	public AppConfig() {
		packages("in.nit.controller");
	}
	
	/*
	 * public AppConfig(ServiceLocator locator) {
	 * ServiceLocatorUtilities.enableImmediateScope(locator);
	 * packages("in.nit.controller"); }
	 */

}
