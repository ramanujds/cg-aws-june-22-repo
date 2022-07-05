package com.cg.employeeapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.employeeapp.exception.DuplicateEmployeeException;
import com.cg.employeeapp.exception.EmployeeNotFoundException;
import com.cg.employeeapp.exception.InvalidCredentialsException;

@RestControllerAdvice
public class ErrorController {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handleEmployeeNotFoundException(Exception ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(DuplicateEmployeeException.class)
	@ResponseStatus(code = HttpStatus.CONFLICT)
	public String handleDuplicateEmployeeException(Exception ex) {
		return ex.getMessage();
	}
	
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	@ExceptionHandler(InvalidCredentialsException.class)
	public String handleInvalidCredentialsException(Exception ex) {
		return ex.getMessage();
				
	}
	
}
