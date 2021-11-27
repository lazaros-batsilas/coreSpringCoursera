package com.javabrains.demo.dao;

import java.util.List;

import com.javabrains.demo.User;

public interface UserDao {
	public User getUser(int id);
	public List<User> getUsers();
}
