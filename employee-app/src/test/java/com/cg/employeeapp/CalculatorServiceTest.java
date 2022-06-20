package com.cg.employeeapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.employeeapp.service.CalculatorService;

public class CalculatorServiceTest {

	@Test
	public void testAdd() {
		CalculatorService calc= new CalculatorService();
		assertEquals(30 , calc.add(10, 20) );
	}
	
	
}
