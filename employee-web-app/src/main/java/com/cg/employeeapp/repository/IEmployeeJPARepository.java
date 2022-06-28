package com.cg.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.employeeapp.model.Employee;

public interface IEmployeeJPARepository extends JpaRepository<Employee, Integer> {

}
