package com.cg.employeeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employeeapp.dto.UserCredentials;
import com.cg.employeeapp.model.User;
import com.cg.employeeapp.service.IUserService;


@RestController
public class UserController {
	
	@Autowired
	private IUserService service;

	@ResponseStatus(code= HttpStatus.CREATED)
	@PostMapping("/users/register")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	
	@PostMapping("/users/authenticate")
	public User authenticateUser(@RequestBody UserCredentials creds) {
		return service.getUserByUserNameAndPassword(creds.getUserName(), creds.getPassword());
	}
	
	
}
