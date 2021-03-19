package com.example.Authentication;

import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EntityTests {
	
	@Test
	public void WhenSetPassword_CheckGetPassword() {
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void WhenSetId_CheckGetId() {
		User testUser = new User();
		
		testUser.setId(7);
		assertEquals(testUser.getId(), 7);
	}
	
	@Test
	public void WhenSetName_CheckGetName() {
		User testUser = new User();
		
		testUser.setName("myname");
		assertEquals(testUser.getName(),"myname");
	}
	
	@Test
	public void WhenSetEmail_CheckGetEmail() {
		User testUser = new User();
		
		testUser.setEmail("ex@ample.com");
		assertEquals(testUser.getEmail(),"ex@ample.com");
	}
	
	@Test
	public void WhenCreateBlankUser_CheckCreatedBlankUser() {
		User testUser = new User();
		
		assertEquals(testUser.getId(), 0);
		assertNull(testUser.getName());
		assertNull(testUser.getEmail());
		assertNull(testUser.getPassword());
	}
	
	@Test
	public void WhenCreateSpecificUser_CheckCreatedSpecificUser() {
		User testUser = new User(9, "myname", "ex@ample.com", "mypassword");
		
		assertEquals(testUser.getId(), 9);
		assertEquals(testUser.getName(),"myname");
		assertEquals(testUser.getEmail(),"ex@ample.com");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
}
