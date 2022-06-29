package com.cg.employeeapp.exception;

public class DuplicateEmployeeException extends RuntimeException{

	public DuplicateEmployeeException(String msg) {
		super(msg);
	}
	
}
