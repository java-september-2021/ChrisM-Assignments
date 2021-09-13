package com.chrism.displaydate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displaydatecontroller {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	
}
