package com.chrism.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home(@ModelAttribute("errors")String errors, Model viewModel) {
		viewModel.addAttribute("errors", errors);
		return "index.jsp";
	}
	
	@RequestMapping(path="/passcode", method=RequestMethod.POST)
	public String pass(@RequestParam(value="password")String password, RedirectAttributes redirectAttributes) {
		if(password.equals("bushido")) {
			return "redirect:/secret";
		} else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping(path="/secret")
	public String secret() {
		return "secret.jsp";
	}
	
	
}
