package com.javabrains.demo.dao;

import java.util.Arrays;
import java.util.List;

import javax.inject.Named;

import com.javabrains.demo.User;

@Named("dao")
public class UserDaoImpl implements UserDao {
	
	List<User> users = Arrays.asList(
			new User("john", "smith", "Programming", 87.),
			new User("dave", "jones", "English", 96.),
			new User("mike", "cooper", "Economics", 90.));
	
	public User getUser(int id) {
		return users.get(id);
	}
	
	public List<User> getUsers() {
		return users;
	}
}
