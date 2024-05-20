package com.example.maven.service;

import com.example.maven.Implementation.ContactServiceImpl;
import com.example.mavenprojectService.ContactService;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ContactServiceTest {
	
	@Test
	public void testGetNameById() {
		ContactService service = new ContactServiceImpl();
		String name= service.getNameById(101);
		assertNotNull(name);
	}

}
