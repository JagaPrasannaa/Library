package com.wipro.employee.service;

import java.util.List;

import com.wipro.employee.model.Employee;
import com.wipro.employee.model.Login;

public interface EmployeeService {

	String doRegister(Employee employee);
	String doModify(Employee employee);
	void doDelete(int employeeId);
	Employee getEmployee(int employeeId);
	List<Integer> getEmployeeId();
	List<Employee> getAllEmployee();
	String doLogin(Login loginBean);
	String doRegisterUser(Login loginBean);
}
