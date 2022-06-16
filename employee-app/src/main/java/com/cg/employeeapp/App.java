package com.cg.employeeapp;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.employeeapp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");
    	EntityManager emgr = factory.createEntityManager();
    	EntityTransaction tx = emgr.getTransaction();
    	Scanner scan = new Scanner(System.in);
    	
    	// Save a new Employee
    	
//    	Employee employee1 = new Employee(1004, "Rohit Reddy", "rohit@yahoo.com", LocalDate.of(2020, 5,15));
//    	Employee employee2 = new Employee(1003, "Priyanka Sharma", "priyanka@yahoo.com", LocalDate.of(2021, 2,10));
//    	
//    	tx.begin();
//    	emgr.persist(employee1);
//    	emgr.persist(employee2);
//    	tx.commit();
//    	
//    	System.out.println("Employee Saved");
    	
    	// Fetch an Employee using Id
    	
//    	Employee employee = emgr.find(Employee.class, 1003);
//    	
//    	System.out.println(employee);
    	
    	// Delete an employee
    	
//    	Employee employee = emgr.find(Employee.class, 1003);
//    	tx.begin();
//    	emgr.remove(employee);
//    	tx.commit();
    	

    	
    	// Updating Employee
//    	tx.begin();
//    	Employee employee = emgr.find(Employee.class, 1003);
//    	employee.setEmployeeName("Priyanka Dutta");
//    	tx.commit();
    	
//		Fetch all the employees
    	
    	Query query = emgr.createQuery("from Employee");
    	List<Employee> employees = query.getResultList();
    	employees.forEach(e->System.out.println(e));
    	
//    	String email;
//    	System.out.println("Enter an email to search for: ");
//    	email = scan.nextLine();
//    	
//    	TypedQuery<Employee> findByEmail = emgr.createQuery("from Employee where email=:email",Employee.class);
//    	findByEmail.setParameter("email", email);
//    	
//    	Employee emp = findByEmail.getSingleResult();
//    	
//    	System.out.println(emp);
    	
    	
//    	String name;
//    	System.out.println("Enter a name to search for: ");
//    	name = scan.nextLine();
//    	Query findByName = emgr.createNamedQuery("findByEmployeeName");
//    	findByName.setParameter("employeeName", name);
//    	
//    	Employee emp = (Employee)findByName.getSingleResult();
//    	
//    	System.out.println(emp);
    	
//    	query = emgr.createNativeQuery("select * from employee_db", Employee.class);
//    	
//    	employees = query.getResultList();
//    	employees.forEach(e->System.out.println(e));
    	
    	
    }
}
