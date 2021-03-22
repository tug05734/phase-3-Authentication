package com.example.Authentication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.example.Authentication.entities.User;
import com.example.Authentication.services.UserService;

@DataJpaTest
public class ServiceTest {

	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private UserService userService;
	
	@Test
	public void whenSearchByEmail_checkUserReturned() {
		User user = new User();
		user.setName("Jane Doe");
		user.setEmail("jdoe@gmail.com");
		user.setPassword("test2");
		entityManager.persist(user);
		entityManager.flush();
		
		User found = userService.getUserByEmail(user.getEmail());
		
		assertEquals(found.getName(), user.getName());
		assertEquals(found.getEmail(), user.getEmail());
		assertEquals(found.getPassword(), user.getPassword());
	}
}
