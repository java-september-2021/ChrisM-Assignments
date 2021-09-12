package com.chrism.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//Depending on which mapping or parameters you add you will get different results
@Controller
public class HelloHumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required = false)String name, Model model) {
		model.addAttribute("name", name);
		return "test.jsp";
	}
	@RequestMapping("/hello/")
	public String noParam(Model model) {
		model.addAttribute("hello", "Human");
		return "hello.jsp";
	}
	@RequestMapping("/hello/{firstName}/{lastName}")
	public String multiParam(@PathVariable String firstName, @PathVariable String lastName, Model model) {
		
		model.addAttribute(firstName, firstName);
		model.addAttribute(lastName, lastName);
		return "test.jsp";
	}

}
