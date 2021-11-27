package com.javabrains.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.javabrains.demo.User;
import com.javabrains.demo.dao.UserDao;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	private int numOfUsers;
	
	public User getUserById(int id) {
		return userDao.getUser(id);
	}
	
	public List<User> getAllUsers() {
		return userDao.getUsers().stream().limit(numOfUsers).collect(Collectors.toList());
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public int getNumOfUsers() {
		return numOfUsers;
	}

	public void setNumOfUsers(int numOfUsers) {
		this.numOfUsers = numOfUsers;
	}
	
	
}
