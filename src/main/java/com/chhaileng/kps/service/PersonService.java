package com.chhaileng.kps.service;

import java.util.List;

import com.chhaileng.kps.model.Person;

public interface PersonService {
	void add(Person p);
	List<Person> findAll();
}
