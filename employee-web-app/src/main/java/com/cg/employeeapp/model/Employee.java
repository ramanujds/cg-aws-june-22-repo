package com.cg.employeeapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Employee {

	private int id;
	private String employeeName;
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiredate;
	
	public Employee() {

	}

	public Employee(int id, String employeeName, String email, LocalDate hiredate) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.email = email;
		this.hiredate = hiredate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", email=" + email + ", hiredate=" + hiredate
				+ "]";
	}
	
	
	
}
