package com.cg.employeeapp.repository;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface EmployeeRepository {

	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(long employeeId);
	
	Employee getEmployeeByEmail(String email);
	
	List<Employee> getAllEmployees();
	
	boolean deleteEmployee(long employeeId);
	
	public Employee updateEmployee(Employee employee);
	
}
