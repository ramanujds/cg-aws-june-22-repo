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
import com.cg.employeeapp.ui.AppUi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	AppUi uiObj = new AppUi();
    	
    	uiObj.searchEmployee();

    	
    	
    }
}
