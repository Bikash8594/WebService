package in.nit.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;

import in.nit.model.Employee;
import in.nit.util.HibernateUtil;

public class EmployeeDaoImpl implements IEmployeeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployee() {
		Session ses=HibernateUtil.getSf().openSession();
		List<Employee>list=null;
		try(ses) {
			list=ses.createQuery("from in.nit.model.Employee e").list();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Integer saveEmployee(Employee e) {
		Session ses=HibernateUtil.getSf().openSession();
		Transaction tx=null;
		Integer id=null;
		try(ses) {
			tx=ses.beginTransaction();
			id=(Integer) ses.save(e);
			tx.commit();
			
		} catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		return id;
	}
	@Override
	public void deleteEmployee(Integer id) {
		Session ses=HibernateUtil.getSf().openSession();
		
	}

}
