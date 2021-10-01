package com.chrism.driverslicense.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.driverslicense.models.Person;
import com.chrism.driverslicense.services.PersonService;

@Controller
public class PersonController {
	private PersonService pService;
	public PersonController(PersonService pService) {
		this.pService = pService;
	}
	
	@RequestMapping("/person/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
}
