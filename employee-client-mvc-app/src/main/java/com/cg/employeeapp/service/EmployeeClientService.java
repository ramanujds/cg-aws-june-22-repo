package com.cg.employeeapp.service;

import com.cg.employeeapp.model.Employee;

public interface EmployeeClientService {

	public Employee getEmployee(int id);
	
	public Employee addEmployee(Employee employee);
	
	
}
