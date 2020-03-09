package in.nit.dao;

import java.util.List;

import in.nit.model.Employee;

public interface IEmployeeDao {
	List<Employee>getAllEmployee();
	public Integer saveEmployee(Employee e);
	public void deleteEmployee(Integer id);

}
