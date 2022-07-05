package com.cg.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeeapp.exception.InvalidCredentialsException;
import com.cg.employeeapp.model.User;
import com.cg.employeeapp.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository repo;
	
	@Override
	public User addUser(User user) {
		User savedUser = repo.save(user);
		return hidePassword(savedUser);
	}

	@Override
	public User getUserByUserNameAndPassword(String username, String password) {
		User user =  repo.findByUserNameAndPassword(username, password);
		if(user==null) {
			throw new InvalidCredentialsException("Inavlid isername/password");
		}
		return hidePassword(user);
	}
	
	private User hidePassword(User user) {
		user.setPassword("*************");
		return user;
	}

}
