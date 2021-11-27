package com.javabrains.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javabrains.demo.service.UserService;

@SpringBootTest
class SpringCoreCourseraApplicationTests {
	
	ClassPathXmlApplicationContext context;
	UserService service;
	
	@BeforeEach
	void setup() {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}

	@Test
	void contextLoads() {
		service = (UserService) context.getBean("userService");
		assertNotNull(service);
	}

}
