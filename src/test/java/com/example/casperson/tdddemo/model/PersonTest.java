package com.example.casperson.tdddemo.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPersonConstructor() {
		Person person = new Person();
		
		assertNotNull(person);
	}
	
	@Test
	public void testNamePerson() {
		Person person = new Person();
		person.setFirstName("Bill");
		person.setLastName("Casperson");
		
		assertEquals("Bill Casperson", person.formatFullName());
	}

}
