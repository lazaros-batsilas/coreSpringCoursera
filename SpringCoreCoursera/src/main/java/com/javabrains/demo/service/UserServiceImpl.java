package com.javabrains.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

import com.javabrains.demo.User;
import com.javabrains.demo.dao.UserDao;

@Named("userService")
public class UserServiceImpl implements UserService{

	@Inject
	private UserDao userDao;
	@Value("2")
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
