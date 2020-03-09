package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.nit.dao.EmployeeDaoImpl;
import in.nit.dao.IEmployeeDao;
import in.nit.service.EmployeeServiceImpl;
import in.nit.service.IEmployeeService;
@ApplicationPath("/rest")
public class AppConfig  extends ResourceConfig{
	public AppConfig() {
packages("in.nit");
register(new AbstractBinder() {
	
	@Override
	protected void configure() {
		bind(EmployeeServiceImpl.class).to(IEmployeeService.class);
		bind(EmployeeDaoImpl.class).to(IEmployeeDao.class);
		
	}
});
	}

}
