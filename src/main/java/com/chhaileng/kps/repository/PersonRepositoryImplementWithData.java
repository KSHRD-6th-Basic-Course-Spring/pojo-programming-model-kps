package com.chhaileng.kps.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chhaileng.kps.model.Person;

//@Repository
public class PersonRepositoryImplementWithData implements PersonRepository {

	private List<Person> people = new ArrayList<>();
	
	public PersonRepositoryImplementWithData() {
		people.add(new Person(1, "Dara", "M", 18));
		people.add(new Person(2, "Sok", "M", 18));
		people.add(new Person(3, "Sao", "F", 18));
		people.add(new Person(4, "Bopha", "F", 20));
		people.add(new Person(5, "Dary", "M", 18));
		people.add(new Person(6, "Daro", "M", 18));
	}
	
	@Override
	public void add(Person p) {
		people.add(p);
	}

	@Override
	public List<Person> findAll() {
		return people;
	}
	
}
