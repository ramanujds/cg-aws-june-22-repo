package com.cg.employeeapp.service;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.repository.EmployeeRepository;
import com.cg.employeeapp.repository.EmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository repo;
	
	public EmployeeServiceImpl() {
		repo = new EmployeeRepositoryImpl();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return repo.saveEmployee(employee);
	}

	@Override
	public Employee findEmployee(long employeeId) {
		return repo.getEmployeeById(employeeId);
		}

}
