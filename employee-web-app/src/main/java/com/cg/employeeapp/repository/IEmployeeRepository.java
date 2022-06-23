package com.cg.employeeapp.repository;

import com.cg.employeeapp.model.Employee;

public interface IEmployeeRepository {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int id);
	
}
