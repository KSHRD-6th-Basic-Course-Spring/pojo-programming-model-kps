package com.chhaileng.kps.repository;

import java.util.List;

import com.chhaileng.kps.model.Person;

public interface PersonRepository {
	void add(Person p);
	List<Person> findAll();
}
