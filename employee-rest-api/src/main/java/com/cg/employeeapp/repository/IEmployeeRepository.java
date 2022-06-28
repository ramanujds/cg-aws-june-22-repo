package com.cg.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.employeeapp.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByEmail(String email);
	
	@Query("from Employee where jobTitle=:jobTitle")
	public List<Employee> findByJobTitle(String jobTitle);
	
}
