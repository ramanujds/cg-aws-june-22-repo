package com.cg.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeRepository repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public Employee getEmployee(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee searchByEmail(String email) {
		return repo.findByEmail(email);
	}
	
	@Override
	public List<Employee> findAllEmployeesByJob(String jobTitle) {
		return repo.findByJobTitle(jobTitle);
	}
	
}
