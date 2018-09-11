package com.example.casperson.tdddemo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.casperson.tdddemo.exception.PersonNotFoundException;
import com.example.casperson.tdddemo.model.Person;

@Repository
public class PersonRepository {

	public List<Person> findAllByLastName(String lastName) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(createPerson("Bill",lastName));
		persons.add(createPerson("Tania",lastName));
		persons.add(createPerson("Brad",lastName));

		if("Casperson".equals(lastName)) {
			return persons;
		}
		throw new PersonNotFoundException();
	}
	
	private Person createPerson(String first, String last) {
		Person person = new Person();
		person.setFirstName(first);
		person.setLastName(last);
		return person;
	}

}
