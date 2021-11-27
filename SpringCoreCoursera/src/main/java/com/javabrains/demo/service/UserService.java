package com.javabrains.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.javabrains.demo.User;

public interface UserService {
	public User getUserById(int id);
	public List<User> getAllUsers(); 
}
