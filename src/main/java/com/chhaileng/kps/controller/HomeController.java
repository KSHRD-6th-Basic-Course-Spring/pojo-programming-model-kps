package com.chhaileng.kps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chhaileng.kps.model.Person;
import com.chhaileng.kps.service.PersonService;

@Controller
public class HomeController {

	private PersonService personService;
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/add")
	public String add() {
		Person p = new Person(1, "Sok", "M",	20);
		personService.add(p);
		
		return "index";
	}
	
	@GetMapping("/find")
	public String find() {
		personService.findAll().forEach(System.out::println);
		return "index";
	}
	
}
