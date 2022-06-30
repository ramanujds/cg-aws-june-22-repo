package com.cg.employeeapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.employeeapp.model.Employee;

@Service
public class EmployeeClientServiceImpl  implements EmployeeClientService{
	
	private RestTemplate employeeRestClient = new RestTemplate();
	private String employeeRestApiUrl = "http://localhost:8500/employees/";

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeRestClient.postForObject(employeeRestApiUrl, employee, Employee.class);
		
		return savedEmployee;
	}
	
	@Override
	public Employee getEmployee(int id) {
		
		Employee employee = employeeRestClient.getForObject(employeeRestApiUrl+id, Employee.class);
		
		return employee;
	}
	
}
