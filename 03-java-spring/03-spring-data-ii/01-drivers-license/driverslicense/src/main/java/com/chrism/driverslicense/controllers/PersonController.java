package com.chrism.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.driverslicense.models.Person;
import com.chrism.driverslicense.services.LicenseService;
import com.chrism.driverslicense.services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	private PersonService pService;
	private LicenseService lService;
	public PersonController(PersonService pService, LicenseService lService) {
		this.pService = pService;
		this.lService = lService;
	}
	
	@GetMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newperson.jsp";
	}
	
	@PostMapping("/new")
	public String createPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newperson.jsp";
		} else {
			pService.createPerson(person);
			return "redirect:/license/new";
		}
	}
	
	@GetMapping("/{id}")
	public String showPerson(@PathVariable("id") Long id, Model viewModel) {
		Person thisPerson = pService.getOnePerson(id);
		viewModel.addAttribute("thisPerson", thisPerson);
		return "showperson.jsp";
	}
	
	
	
	
	
}
