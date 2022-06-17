package com.cg.employeeapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.employeeapp.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	EntityManagerFactory factory ;
	EntityManager emgr ;
	EntityTransaction tx ;
	
	public EmployeeRepositoryImpl() {
		factory = Persistence.createEntityManagerFactory("employee-persistence");
    	emgr = factory.createEntityManager();
    	tx = emgr.getTransaction();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return emgr.merge(employee);
	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		
		return emgr.find(Employee.class, employeeId);
	}

	@Override
	public Employee getEmployeeByEmail(String email) {
		TypedQuery<Employee> findByEmail = emgr.createQuery("from Employee where email=:email",Employee.class);
		 findByEmail.setParameter("email", email);
		Employee emp = findByEmail.getSingleResult();
    	return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		TypedQuery<Employee> findAll = emgr.createQuery("from Employee", Employee.class);
		return findAll.getResultList();
	}

	@Override
	public boolean deleteEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
