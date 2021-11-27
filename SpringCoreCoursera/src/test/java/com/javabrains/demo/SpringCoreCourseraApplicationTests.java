package com.javabrains.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.javabrains.demo.config.ApplicationConfig;
import com.javabrains.demo.service.UserService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=ApplicationConfig.class)
@SpringBootTest
class SpringCoreCourseraApplicationTests {
	
	@Inject
	UserService service;

	@Test
	void contextLoads() {
		User user = service.getUserById(1);
		assertNotNull(service);
		assertEquals(user.getName(),"dave");
	}
	
	@Test
	void getAllUsers() {
		service.getAllUsers().stream().forEach(user->System.out.println(user.getName()));
	}
	
	@Test
	void getUsersForDepartment() {
		List<User> users = service.getUsersForDepartment();
		assertEquals(users.size(), 1);
	}

}
