package com.cg.employeeapp.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.employeeapp.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements IEmployeeRepository {

	Map<Integer, Employee> employeeDb;
	
	@PostConstruct
	public void init() {
		employeeDb= new HashMap<>();
	}
	
	@Override
	public Employee saveEmployee(Employee employee) {
		employeeDb.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return employeeDb.get(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDb.put(employee.getId(), employee);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int id) {
		employeeDb.remove(id);
		return !employeeDb.containsKey(id);
	}

	
	
}
