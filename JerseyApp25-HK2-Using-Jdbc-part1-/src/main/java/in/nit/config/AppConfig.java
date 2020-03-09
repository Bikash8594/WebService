package in.nit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import in.nit.dao.IStudentDao;
import in.nit.dao.Impl.StudentDaiImpl;
import in.nit.service.IStudentService;
import in.nit.service.Impl.StudentServiceImpl;

@ApplicationPath("/rest")
public class AppConfig  extends ResourceConfig {
	public AppConfig() {
 packages("in.nit.controller");
 register(new AbstractBinder() {
	
	@Override
	protected void configure() {
		bind(StudentServiceImpl.class).to(IStudentService.class);
		bind(StudentDaiImpl.class).to(IStudentDao.class);
		
	}
});
	}
}
