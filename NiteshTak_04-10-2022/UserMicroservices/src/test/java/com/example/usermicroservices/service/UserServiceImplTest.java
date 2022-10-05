package com.example.usermicroservices.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.usermicroservices.entity.User;
import com.example.usermicroservices.vo.UserInstitutionVO;

@SpringBootTest
class UserServiceImplTest {

	@Autowired
	IUserService iUserService;
	
	@Test
	void testAddUSer() {
		User user = new User("Pankaj","pankaj@email.com",3L);
		User responsUser = iUserService.addUSer(user);
		assertNotNull(responsUser);
		
		assertEquals("Pankaj", responsUser.getUserName());
	}

	@Test
	void testFindById() {
		
		User user = iUserService.findById(2L);
		
		assertEquals(2, user.getInstId());
		
	}

	@Test
	void testGetUserWithDept() {
		
		UserInstitutionVO userInstitutionVO = iUserService.getUserWithDept(3L);
		
		assertNotNull(userInstitutionVO.getUser());
		assertNotNull(userInstitutionVO.getInstitution());
		assertEquals("VIIT", userInstitutionVO.getInstitution().getInstName());
		
	}

}
