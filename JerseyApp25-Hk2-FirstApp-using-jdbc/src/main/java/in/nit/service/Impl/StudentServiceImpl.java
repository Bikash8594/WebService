package in.nit.service.Impl;

import javax.inject.Inject;

import in.nit.dao.IStudentDao;
import in.nit.model.Student;
import in.nit.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	@Inject
	private IStudentDao dao;

	public int saveStudent(Student s) {
		double sfee=s.getSfee();
	double	discount=sfee*5/100.0;
	s.setDiscount(discount);

		return dao.saveStudent(s);
	}

}
