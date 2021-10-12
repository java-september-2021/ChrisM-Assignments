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

import com.chrism.dojooverflow.authentication.models.Event;
import com.chrism.dojooverflow.authentication.models.State;
import com.chrism.dojooverflow.authentication.models.User;
import com.chrism.dojooverflow.authentication.services.EventService;
import com.chrism.dojooverflow.authentication.services.UserService;
import com.chrism.dojooverflow.authentication.validators.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	
	@Autowired
	private UserValidator uValidator;
	
	@Autowired
	private EventService eService;
	
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
		return "redirect:/events";
	}
	
	@GetMapping("/events")
	public String home(@ModelAttribute("event") Event event, HttpSession session, Model viewModel, RedirectAttributes redirectAttr) {
		// if user not logged in send them back to registration
		if(session.getAttribute("user__id") == null) {
			redirectAttr.addFlashAttribute("message", "No user logged in");
			return "redirect:/registration";
		}
		// get userId from session
		Long userId = (Long)session.getAttribute("user__id");
		// Get user to get the list of events by user's state and not by state
		User user = this.uService.findUserById(userId);
		viewModel.addAttribute("eventsInState", this.eService.getEventsByState(user.getState()));
		viewModel.addAttribute("outOfStateEvents", this.eService.getOutOfStateEvents(user.getState()));
		
		// add user to the model
		viewModel.addAttribute("user", uService.findUserById(userId));
		// Grab the state array from the state model that is just an array
		viewModel.addAttribute("states", State.States);
		return "home.jsp";
	}
	
	@PostMapping("/events")
	public String newEvent(@Valid @ModelAttribute("event") Event event, HttpSession session, Model viewModel, BindingResult result) {
		if(result.hasErrors()) {
			// Getting userId from session
			Long userId = (Long)session.getAttribute("user__id");
			// Get user to get the list of events by user's state and not by state
			User user = this.uService.findUserById(userId);
			viewModel.addAttribute("eventsInState", this.eService.getEventsByState(user.getState()));
			viewModel.addAttribute("outOfStateEvents", this.eService.getOutOfStateEvents(user.getState()));
			
			// add user to the model
			viewModel.addAttribute("user", user);
			// Grab the state array from the state model that is just an array
			viewModel.addAttribute("states", State.States);
			return "home.jsp";
		}
		this.eService.createEvent(event);		
		return "redirect:/events";}
	
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword") String password, HttpSession session, RedirectAttributes redirectAttr ) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttr.addFlashAttribute("error", "Invalid email or password");
			return "redirect:/registration";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/events";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, RedirectAttributes redirectAttr) {
		redirectAttr.addFlashAttribute("message", "You've been logged out. Thank you for stopping by!");
		session.invalidate();
		return "redirect:/registration";
	}
}
