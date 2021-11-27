package com.javabrains.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.javabrains.demo.dao.UserDao;
import com.javabrains.demo.dao.UserDaoImpl;
import com.javabrains.demo.service.UserService;
import com.javabrains.demo.service.UserServiceImpl;

@Configuration
@PropertySource("application.properties")
public class ApplicationConfig {
	
	@Bean
	public UserDao userDao() {
		return new UserDaoImpl();
	}
	
	@Value("${max}")
	private int numOfUsers;
	
	@Bean
	public UserService userService(){
		UserServiceImpl service = new UserServiceImpl();
		service.setNumOfUsers(numOfUsers);
		service.setUserDao(userDao());
		return service;
	}
	
	@Bean
	static public PropertySourcesPlaceholderConfigurer getPropertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
		
	}
	

}
