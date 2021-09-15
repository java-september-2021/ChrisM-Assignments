package com.chrism.displaydate.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displaydatecontroller {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model viewModel) {
		Date todaysDate = new java.util.Date();
		viewModel.addAttribute("date", todaysDate);
		return "date.jsp";
	
	}
	
	@RequestMapping("/time")
	public String time(Model viewModel) {
		Date todaysDate = new java.util.Date();
		viewModel.addAttribute("time", todaysDate);
		return "time.jsp";
	}
}
