package com.javabrains.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabrains.demo.config.ApplicationConfig;
import com.javabrains.demo.service.UserService;

@SpringBootTest
class SpringCoreCourseraApplicationTests {
	
	AnnotationConfigApplicationContext context;
	UserService service;
	
	@BeforeEach
	void setup() {
		context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		service = context.getBean("userService", UserService.class);
	}

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

}
