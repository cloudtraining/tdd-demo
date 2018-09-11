package com.example.casperson.tdddemo.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.casperson.tdddemo.model.Person;
import com.example.casperson.tdddemo.repository.PersonRepository;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

	@InjectMocks
	PersonService personService;

	@Mock
	PersonRepository repo;

	List<Person> persons;

	@Before
	public void buildPerson() {
		persons = new ArrayList<Person>();
		persons.add(createPerson("brad", "vandermoon"));
		persons.add(createPerson("bill", "vandermoon"));
		persons.add(createPerson("silly", "vandermoon"));
	}

	@Test
	public void findAllByLastName() {
		when(repo.findAllByLastName("vandermoon")).thenReturn(persons);
		List<Person> personsFound = personService.findAllByLastName("vandermoon");
		assertNotNull(personsFound);
	}

	private Person createPerson(String first, String last) {
		Person person = new Person();
		person.setFirstName(first);
		person.setLastName(last);
		return person;
	}

}
