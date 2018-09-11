package com.example.casperson.tdddemo.repository;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

import com.example.casperson.tdddemo.exception.PersonNotFoundException;
import com.example.casperson.tdddemo.model.Person;

public class PersonRepositoryTest {

	@Test
	public void testFindAllByLastName() {
		
		PersonRepository personRepository = new PersonRepository();
		assertNotNull(personRepository);
		List<Person> personList = personRepository.findAllByLastName("Casperson");
		assertNotNull(personList);
	}

	@Test(expected=PersonNotFoundException.class)
	public void testExceptionForNotFoundPersons() {
		PersonRepository personRepository = new PersonRepository();
		personRepository.findAllByLastName("Vandermoon");
		
	}

}
