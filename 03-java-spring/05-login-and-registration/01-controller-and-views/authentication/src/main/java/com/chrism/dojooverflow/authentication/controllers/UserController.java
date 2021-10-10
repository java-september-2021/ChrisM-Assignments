package com.chrism.dojooverflow.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chrism.dojooverflow.authentication.models.User;
import com.chrism.dojooverflow.authentication.services.UserService;
import com.chrism.dojooverflow.authentication.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	
	@Autowired
	private UserValidator uValidator;
	
	@GetMapping("/registration")
	public String register(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	
	@PostMapping("/registration")
	public String newUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		uValidator.validate(user, result);
		if(result.hasErrors()) {
			return "registrationPage.jsp";
		}
		User newUser = uService.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String home(HttpSession session, Model viewModel, RedirectAttributes redirectAttr) {
		if(session.getAttribute("user__id") == null) {
			redirectAttr.addFlashAttribute("message", "No user logged in");
		}
		Long userId = (Long)session.getAttribute("user__id");
		viewModel.addAttribute("user", uService.findUserById(userId));
		return "home.jsp";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword") String password, HttpSession session, RedirectAttributes redirectAttr ) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("error", "Invalid email or password");
			return "redirect:/registration";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/home";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute("message", "You've been logged out. Thank you for stopping by!");
		session.invalidate();
		return "redirect:/registration";
	}
}
