package com.cg.employeeapp.ui;

import java.util.Scanner;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.service.EmployeeService;
import com.cg.employeeapp.service.EmployeeServiceImpl;

public class AppUi {
	
	private EmployeeService service;
	private Scanner scan;
	public AppUi() {
		service = new EmployeeServiceImpl();
		scan = new Scanner(System.in);
	}

	public void searchEmployee() {
		System.out.println("Enter an id to search for: ");
		long id = scan.nextLong();
		Employee employee = service.findEmployee(id);
		System.out.println(employee);
		
	}
	
}
