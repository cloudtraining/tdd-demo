package com.example.casperson.tdddemo.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Array;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.casperson.tdddemo.TddDemoApplication;
import com.example.casperson.tdddemo.model.Person;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TddDemoApplication.class, webEnvironment=WebEnvironment.RANDOM_PORT)

public class PersonControllerIntegrationTest {

	@Autowired
	PersonController personController;
	
	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	public void testControllerForNonNull() {
		assertNotNull(personController);
		Array.newInstance(Object.class, 10);
	}
	
	@Test
	public void testRetrievePeople_HappyPath() {
		List<Person> actual = personController.findAllPeopleWithLastName("Casperson");
		assertNotNull(actual);
	}
	
	@Test
	public void testRestTemplate() {
		@SuppressWarnings("rawtypes")
		ResponseEntity<List> actual = testRestTemplate.getForEntity("/personController/findAllPeopleWithLastName?lastName=Casperson", List.class);
		assertNotNull(actual);
		assertEquals(3, actual.getBody().size());
		String expected = "[{firstName=Bill, lastName=Casperson}, {firstName=Tania, lastName=Casperson}, {firstName=Brad, lastName=Casperson}]";
		assertEquals(expected, actual.getBody().toString());
		System.out.println("************" + actual.getBody());
		
	}
}
