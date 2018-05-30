package com.chhaileng.kps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhaileng.kps.model.Person;
import com.chhaileng.kps.repository.PersonRepository;

@Service
public class PersonServiceImplement implements PersonService {

	private PersonRepository personRepository;
	
	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void add(Person p) {
		personRepository.add(p);
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
