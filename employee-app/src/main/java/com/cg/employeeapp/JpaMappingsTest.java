package com.cg.employeeapp;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.model.Laptop;

public class JpaMappingsTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee-persistence");
    	EntityManager emgr = factory.createEntityManager();
    	EntityTransaction tx = emgr.getTransaction();
    	
//   	Employee employee1 = new Employee(1004, "Rohit Reddy", "rohit@yahoo.com", LocalDate.of(2020, 5,15));
//    	Employee employee2 = new Employee(1003, "Priyanka Sharma", "priyanka@yahoo.com", LocalDate.of(2021, 2,10));
//    	
//    	Laptop laptop1= new Laptop(4060141, "MacBook Pro", "Apple", 16);
//    	
//    	Laptop laptop2= new Laptop(6539861, "ROG", "ASUS", 8);
//    	
//    	Laptop laptop3= new Laptop(2349861, "MacBook Air", "Apple", 8);
//    	
//    	employee1.getLaptops().add(laptop1);
//    	employee1.getLaptops().add(laptop2);
//    	employee2.getLaptops().add(laptop3);
//   	
//    	tx.begin();
//    	emgr.persist(laptop1);
//    	emgr.persist(laptop2);
//    	emgr.persist(laptop3);
//    	emgr.persist(employee1);
//    	emgr.persist(employee2);
//    	tx.commit();
    	
    	Employee emp = emgr.find(Employee.class, 1004);
    	System.out.println(emp);
    	emp.getLaptops().forEach(laptop->System.out.println(laptop));
		
	}
	
}
