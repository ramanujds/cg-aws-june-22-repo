package com.cg.employeeapp.service;

import com.cg.employeeapp.model.User;

public interface IUserService {

	public User addUser(User user);
	
	public User getUserByUserNameAndPassword(String username, String password);
	
}
