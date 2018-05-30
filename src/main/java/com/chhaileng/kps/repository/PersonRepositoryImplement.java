package com.chhaileng.kps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chhaileng.kps.model.Person;

@Repository
public class PersonRepositoryImplement implements PersonRepository {

	private List<Person> people = new ArrayList<>();
	
	@Override
	public void add(Person p) {
		people.add(p);
	}

	@Override
	public List<Person> findAll() {
		return people;
	}
	
}
