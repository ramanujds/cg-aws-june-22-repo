package com.cg.employeeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.EmployeeClientService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeClientService service;
	
	@PostMapping("/add-employee")
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "show-employee.jsp";
	}
	
	@GetMapping("/search-employee")
	public String getEmployee(@RequestParam("empid") int id, Model m) {
		Employee employee = service.getEmployee(id);
		m.addAttribute("employee", employee);
		return "show-employee.jsp";
	}
	
	@GetMapping("/show-all")
	public String showAllEmployees(Model m) {
		List<Employee> employeeList = service.getAllEmployee();
		m.addAttribute("employees", employeeList);
		return "show-all.jsp";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("id") int id ,Model m) {
		service.deleteEmployee(id);
		List<Employee> employeeList = service.getAllEmployee();
		m.addAttribute("employees", employeeList);
		return "show-all.jsp";
	}
	
	
//	@GetMapping("/search-employee")
//	@ResponseBody
//	public Employee getEmployeeById(@RequestParam("empid") int id) {
//		Employee employee = service.getEmployee(id);
//		return employee;
//	}
	
	
}
