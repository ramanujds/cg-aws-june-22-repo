package com.cg.employeeapp.service;

import com.cg.employeeapp.model.Employee;

public interface IEmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
	
}
