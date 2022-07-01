package com.cg.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.IEmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	IEmployeeService service;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return service.findAllEmployees();
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return service.getEmployee(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(  @PathVariable int id) {
		service.deleteEmployee(id);
	}
	
	@GetMapping("/email/{email}")
	public Employee searchByEmail(@PathVariable("email") String email) {
		return service.searchByEmail(email);
	}
	
	@GetMapping("/job/{job}")
	public List<Employee> searchByJob(@PathVariable("job") String jobTitle) {
		return service.findAllEmployeesByJob(jobTitle);
	}
	
	
}
