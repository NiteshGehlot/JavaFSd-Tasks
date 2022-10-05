package com.example.usermicroservices.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.example.usermicroservices.entity.User;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j         //logger
class UserControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@Test
	@Disabled
	void testAddUSer() {
		
		User userRequest = new User("Pradium","pra@gmail.com",2L); 
		
		User userResponse = restTemplate.postForObject("http://localhost:8181/api/user/add",userRequest,User.class);
		
		assertTrue(userResponse.getUserId() > 0);
	}

	@Test
	void testFindById() {
		
		User userResponse = restTemplate.getForObject("http://localhost:8181/api/user/get/"+1,User.class);
		
		log.info("User Fetch from db is "+userResponse.getUserName());
		
		assertEquals("Nitesh", userResponse.getUserName());
	}

	

}
