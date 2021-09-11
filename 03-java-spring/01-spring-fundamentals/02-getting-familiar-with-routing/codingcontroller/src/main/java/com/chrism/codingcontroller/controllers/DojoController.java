package com.chrism.codingcontroller.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class DojoController {
	@RequestMapping("")
	public String awesome() {
		return "The Dojo is Awesome!";
	}
	@RequestMapping("/{part2}")
	public String showDojo(@PathVariable("part2")String pathName) {
		
		if(pathName.equals("burbank")) {
			return "Burbank Dojo is located in Southern California";
		}
		if(pathName.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		return "The dojo is awesome!";
	
	}
}
