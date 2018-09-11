package com.example.casperson.tdddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.casperson.tdddemo.model.Person;
import com.example.casperson.tdddemo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	// public List<Person> findByLastNameLike(@RequestParam("lastName") String lastName)
	@RequestMapping(value="/personController/findAllPeopleWithLastName", method= {RequestMethod.GET})
	public List<Person> findAllPeopleWithLastName(@RequestParam("lastName") String lastName) {
		return  personService.findAllByLastName(lastName);
	}

}
