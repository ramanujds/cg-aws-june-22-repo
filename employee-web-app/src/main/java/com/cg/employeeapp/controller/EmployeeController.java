package com.cg.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService service;
	
	@PostMapping("/add-employee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		service.saveEmployee(employee);
		return "show-employee.jsp";
	}
	
	@GetMapping("/search-employee")
	public String getEmployee(@RequestParam("empid") int id, Model m) {
		Employee employee = service.getEmployeeById(id);
		m.addAttribute("employee", employee);
		return "show-employee.jsp";
	}
	
	
	
	
}
