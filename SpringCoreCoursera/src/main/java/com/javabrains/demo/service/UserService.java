package com.javabrains.demo.service;

import java.util.Collection;
import java.util.List;

import com.javabrains.demo.User;

public interface UserService {
	public User getUserById(int id);
	public List<User> getAllUsers(); 
	public List<User> getUsersForDepartment();
}
