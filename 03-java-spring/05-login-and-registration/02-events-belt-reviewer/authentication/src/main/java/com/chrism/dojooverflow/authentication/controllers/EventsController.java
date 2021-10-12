package com.chrism.dojooverflow.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.chrism.dojooverflow.authentication.models.Event;
import com.chrism.dojooverflow.authentication.models.State;
import com.chrism.dojooverflow.authentication.models.User;
import com.chrism.dojooverflow.authentication.services.EventService;
import com.chrism.dojooverflow.authentication.services.UserService;

public class EventsController {
	@Autowired
	private UserService uService;
	
	@Autowired
	private EventService eService;
	


}
