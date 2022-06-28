package com.cg.employeeapp.service;

import java.util.List;

import com.cg.employeeapp.model.Employee;

public interface IEmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployee(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(int id);
	
	public List<Employee> findAllEmployees();
	
	public Employee searchByEmail(String email);
	
	public List<Employee> findAllEmployeesByJob(String jobTitle);
}
