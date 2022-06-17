package com.cg.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	// Initialize the IOC Container
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Laptop laptop = context.getBean(Laptop.class);
    	
    
    	laptop.connectToInternet();
    	laptop.browseWebsite();
    	laptop.showLaptopInfo();
    	
    }
}
