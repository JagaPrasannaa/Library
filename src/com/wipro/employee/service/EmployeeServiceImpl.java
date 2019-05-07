package com.wipro.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.employee.dao.EmployeeDAO;
import com.wipro.employee.model.Employee;
import com.wipro.employee.model.Login;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public String doRegister(Employee employee) {
		return employeeDAO.doRegister(employee);
	}

	@Transactional
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDAO.getAllEmployee();
	}

	@Transactional
	@Override
	public String doModify(Employee employee) {
		return employeeDAO.doModify(employee);
	}

	@Transactional
	@Override
	public List<Integer> getEmployeeId() {
		return employeeDAO.getEmployeeId();
	}

	@Transactional
	@Override
	public Employee getEmployee(int employeeId) {
		
		return employeeDAO.getEmployee(employeeId);
	}

	@Transactional
	@Override
	public void doDelete(int employeeId) {
		employeeDAO.doDelete(employeeId);
		
	}

	@Override
	public String doLogin(Login loginBean) {
		return employeeDAO.doLogin(loginBean);
	}

	@Override
	public String doRegisterUser(Login loginBean) {
		// TODO Auto-generated method stub
		return employeeDAO.doRegisterUser(loginBean);
	}

}
