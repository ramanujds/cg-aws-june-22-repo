package com.cg.employeeapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee_db")
@NamedQuery(name = "findByEmployeeName", query = "from Employee where employeeName=:employeeName")
public class Employee {

	@Id
	private int employeeId;
	@Column(name = "employee_name", nullable = false, length = 100)
	private String employeeName;
	@Column(unique = true)
	private String email;
	private LocalDate hiredate;
	
	@OneToMany(fetch = FetchType.EAGER)
	private List<Laptop> laptops = new ArrayList<>();
	
	


	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Employee() {
	}

	public Employee(int employeeId, String employeeName, String email, LocalDate hiredate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.hiredate = hiredate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", hiredate=" + hiredate + "]";
	}

	

}
