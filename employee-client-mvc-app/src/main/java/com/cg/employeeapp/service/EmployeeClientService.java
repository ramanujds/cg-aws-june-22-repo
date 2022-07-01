package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface EmployeeClientService {

	public Employee getEmployee(int id);
	
	public Employee addEmployee(Employee employee);

	List<Employee> getAllEmployee();
	
	public void deleteEmployee(int id);
	
}
