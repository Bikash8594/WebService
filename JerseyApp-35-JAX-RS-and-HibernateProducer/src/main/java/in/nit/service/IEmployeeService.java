package in.nit.service;

import java.util.List;

import in.nit.model.Employee;

public interface IEmployeeService {
	List<Employee>getAllEmployee();
	public Integer saveEmployee(Employee e);

}
