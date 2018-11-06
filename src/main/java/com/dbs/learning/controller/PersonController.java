package com.dbs.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.learning.pojo.Person;
import com.dbs.learning.repo.PersonRepo;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonRepo personRepo;

	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person){
		personRepo.save(person);
		return person;
	}
	@RequestMapping("/getAll")
	public List<Person> getAllPersons(){
		List<Person> personList=personRepo.findAll();
		return personList;
	}
	
	
	
}

