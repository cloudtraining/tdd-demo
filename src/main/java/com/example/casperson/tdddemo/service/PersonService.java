package com.example.casperson.tdddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.casperson.tdddemo.model.Person;
import com.example.casperson.tdddemo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired 
	PersonRepository repo;
	
	public List<Person> findAllByLastName(String lastName) {
		return repo.findAllByLastName(lastName);
	}

	
	
}
