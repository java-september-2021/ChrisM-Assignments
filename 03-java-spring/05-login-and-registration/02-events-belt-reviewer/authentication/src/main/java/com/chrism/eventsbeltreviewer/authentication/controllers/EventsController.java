package com.chrism.eventsbeltreviewer.authentication.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chrism.eventsbeltreviewer.authentication.models.Event;
import com.chrism.eventsbeltreviewer.authentication.models.Message;
import com.chrism.eventsbeltreviewer.authentication.models.State;
import com.chrism.eventsbeltreviewer.authentication.models.User;
import com.chrism.eventsbeltreviewer.authentication.services.EventService;
import com.chrism.eventsbeltreviewer.authentication.services.MessageService;
import com.chrism.eventsbeltreviewer.authentication.services.UserService;

@Controller
@RequestMapping("/events")
public class EventsController {
	@Autowired
	private UserService uService;
		
	@Autowired
	private EventService eService;
	
	@Autowired
	private MessageService mService;
	
	@GetMapping("")
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
		viewModel.addAttribute("user", user);
		viewModel.addAttribute("eventsCreated", user.getEventsCreated());
		// Grab the state array from the state model that is just an array
		viewModel.addAttribute("states", State.States);
		return "home.jsp";
	}
	
	@PostMapping("")
	public String newEvent(@Valid @ModelAttribute("event") Event event, HttpSession session, Model viewModel, BindingResult result) {
		// Getting userId from session
		Long userId = (Long)session.getAttribute("user__id");
		// Get user to get the list of events by user's state and not by state
		User user = this.uService.findUserById(userId);
		if(result.hasErrors()) {
			viewModel.addAttribute("eventsInState", this.eService.getEventsByState(user.getState()));
			viewModel.addAttribute("outOfStateEvents", this.eService.getOutOfStateEvents(user.getState()));
			// add user to the model
			viewModel.addAttribute("user", user);
			// Grab the state array from the state model that is just an array
			viewModel.addAttribute("states", State.States);
			return "home.jsp";
		}
		//Had to add the user to the createEvent in the service to track who created it
		Event newEvent = this.eService.createEvent(event, user);
		return "redirect:/events";
		}
	
	@GetMapping("/{id}")
	public String eventDetails(@PathVariable("id") Long id, @ModelAttribute("message") Message message, HttpSession session, Model viewModel, RedirectAttributes redirectAttr) {
		// if user not logged in send them back to registration
		if(session.getAttribute("user__id") == null) {
			redirectAttr.addFlashAttribute("message", "No user logged in");
			return "redirect:/registration";
		}
		//Get userid from session and get a user from it.
		Long userId = (Long)session.getAttribute("user__id");
		User user = uService.findUserById(userId);
		Event event = eService.getOneEvent(id);
		//Made Date look pretty in the event service
		List<Message> messages = this.mService.getByEvent(event);
		String prettyDate = this.eService.formatDate(event);
		viewModel.addAttribute("messages", messages);
		viewModel.addAttribute("date", prettyDate);
		viewModel.addAttribute("user", user);
		viewModel.addAttribute("event", event);
		return "eventDetails.jsp";
	}
	
	@PostMapping("/{id}")
	public String addMessage(@Valid @ModelAttribute("message") Message message, BindingResult result, @PathVariable("id") Long id, HttpSession session, Model viewModel, RedirectAttributes redirectAttr) {
		// Getting userId from session
		Long userId = (Long)session.getAttribute("user__id");
		// Get user to get the list of events by user's state and not by state
		User user = this.uService.findUserById(userId);
		Event event = this.eService.getOneEvent(id);
		if(result.hasErrors()) {
			List<Message> messages = this.mService.getByEvent(event);
			//Made Date look pretty in the event service
			String prettyDate = this.eService.formatDate(event);
			viewModel.addAttribute("messages", messages);
			viewModel.addAttribute("date", prettyDate);
			viewModel.addAttribute("user", user);
			viewModel.addAttribute("event", event);
			return "eventDetails.jsp";
		}
		this.mService.createMessage(message, event, user);
		return "redirect:/events/{id}";
	}
	
	@GetMapping("/{id}/edit")
	public String editEvent(@PathVariable("id") Long id, @ModelAttribute("event") Event event, HttpSession session, Model viewModel, RedirectAttributes redirectAttr) {
		Long userId = (Long)session.getAttribute("user__id");
		Event currentEvent = eService.getOneEvent(id);
		Long creatorID = currentEvent.getEventCreator().getId();
		// boot someone if their user id is not the id that created the event.
		if(userId != creatorID) {
			redirectAttr.addFlashAttribute("message", "Creating user not logged in.");
			return "redirect:/registration";
		}
		viewModel.addAttribute("userID", userId);
		viewModel.addAttribute("event", currentEvent);
		viewModel.addAttribute("states", State.States);
		return "editEvent.jsp";
	}
	
	@PostMapping("/{id}/edit")
	public String updateEvent(@Valid @ModelAttribute("event") Event event, BindingResult result, @PathVariable("id") Long id, HttpSession session, RedirectAttributes redirectAttr, Model viewModel) {
		Event currentEvent = eService.getOneEvent(id);
		// Getting userId from session
		Long userId = (Long)session.getAttribute("user__id");
		// Get user to get the list of events by user's state and not by state
		User user = this.uService.findUserById(userId);
		if(result.hasErrors()) {
			Long creatorID = currentEvent.getEventCreator().getId();
			// boot someone if their user id is not the id that created the event.
			if(userId != creatorID) {
				redirectAttr.addFlashAttribute("message", "Creating user not logged in.");
				return "redirect:/registration";
			}
			viewModel.addAttribute("userID", userId);
			viewModel.addAttribute("event", currentEvent);
			viewModel.addAttribute("states", State.States);
			return "editEvent.jsp";
		}
		this.eService.updateEvent(event);
		return "redirect:/events"; 
	}
	
	@GetMapping("/{id}/join")
	public String joinEvent(@PathVariable("id") Long id, HttpSession session) {
		//Getting user in one line this time
		User user = this.uService.findUserById((Long)session.getAttribute("user__id"));
		Event event = this.eService.getOneEvent(id);
		this.eService.joinEvent(user, event);
		return "redirect:/events";
	}
	
	@GetMapping("/{id}/unjoin")
	public String unJoinEvent(@PathVariable("id") Long id, HttpSession session) {
		//Getting user in one line this time
		User user = this.uService.findUserById((Long)session.getAttribute("user__id"));
		Event event = this.eService.getOneEvent(id);
		
		this.eService.unJoinEvent(user, event);
		return "redirect:/events";
	}
	
	
	


}
