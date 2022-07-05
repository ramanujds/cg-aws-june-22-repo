package com.cg.employeeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.employeeapp.model.User;

public interface IUserRepository extends JpaRepository<User, String> {

	User findByUserNameAndPassword(String userName, String password);
	
}
