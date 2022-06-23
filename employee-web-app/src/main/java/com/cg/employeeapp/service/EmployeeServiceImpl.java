package com.cg.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.saveEmployee(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return repo.getEmployeeById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		return repo.deleteEmployee(id);
	}

	
	
}
