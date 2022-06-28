package com.cg.employeeapp.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {

	@Id
	private int id;
	private String employeeName;
	
	private String email;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiredate;
	
	private String jobTitle;
	
	public Employee() {

	}
	
	

	public String getJobTitle() {
		return jobTitle;
	}



	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}



	

	public Employee(int id, String employeeName, String email, LocalDate hiredate, String jobTitle) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.email = email;
		this.hiredate = hiredate;
		this.jobTitle = jobTitle;
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
