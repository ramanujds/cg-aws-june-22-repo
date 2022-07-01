package com.cg.employeeapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.employeeapp.model.Employee;

@Service
public class EmployeeClientServiceImpl implements EmployeeClientService {

	@Autowired
	private RestTemplate employeeRestClient;

	@Value("${EMPLOYEE_REST_API_URL}")
	private String employeeRestApiUrl;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeRestClient.postForObject(employeeRestApiUrl, employee, Employee.class);

		return savedEmployee;
	}

	@Override
	public Employee getEmployee(int id) {

		Employee employee = employeeRestClient.getForObject(employeeRestApiUrl + id, Employee.class);

		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Employee[] employees = employeeRestClient.getForObject(employeeRestApiUrl, Employee[].class);
		List<Employee> allEmployees = Arrays.asList(employees);
		return allEmployees;
	}
	
	@Override
	public void deleteEmployee(int id) {
		employeeRestClient.delete(employeeRestApiUrl + id);
		
	}

}
