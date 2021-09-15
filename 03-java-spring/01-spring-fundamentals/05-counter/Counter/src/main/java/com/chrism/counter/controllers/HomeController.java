package com.chrism.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session, Model viewModel) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model viewModel) {
		if(session.getAttribute("count")!= null) {
			Integer currentCount = (Integer) session.getAttribute("count");
			viewModel.addAttribute("count", currentCount);
		}else {
			session.setAttribute("Count", 0);
			Integer currentCount = (Integer) session.getAttribute("count");
			viewModel.addAttribute("count", currentCount);
		}
		
		return "counter.jsp";
	}
	
	@RequestMapping("/counter2")
	public String counter2(HttpSession session, Model viewModel) {
		if(session.getAttribute("count")== null) {
			session.setAttribute("count", 0);
			Integer currentCount = (Integer) session.getAttribute("count");
			viewModel.addAttribute("count", currentCount);
		}else {
			Integer currentCount = (Integer) session.getAttribute("count");
			//This will technically do a 3 count because it also counts the index visit once
			currentCount += 2;
			session.setAttribute("count", currentCount);
			viewModel.addAttribute("count", currentCount);
		}
		return "counter2.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, Model viewModel) {
		session.setAttribute("count", 0);
		Integer currentCount = (Integer) session.getAttribute("count");
		viewModel.addAttribute("count", currentCount);
		return "reset.jsp";
	}
	
	
}
