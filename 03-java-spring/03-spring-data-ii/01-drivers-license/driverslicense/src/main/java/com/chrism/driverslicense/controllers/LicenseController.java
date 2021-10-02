package com.chrism.driverslicense.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.driverslicense.models.License;
import com.chrism.driverslicense.services.LicenseService;
import com.chrism.driverslicense.services.PersonService;

@Controller
@RequestMapping("/license")
public class LicenseController {
	@Autowired
	private LicenseService lService;
	
	
	@Autowired
	private PersonService pService;
	
	@GetMapping("/new")
	public String newLicense(@ModelAttribute("license") License license, Model viewModel) {
		viewModel.addAttribute("people", this.pService.findNullLicensePeople());
		return "license.jsp";
	}
	
	@PostMapping("/new")
	public String createLicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		Long idPerson = license.getPerson().getId();
		if(result.hasErrors()) {
			return "license.jsp";
		} else {
			lService.createLicense(license);
			return "redirect:/person/" + idPerson;
		}
		
	}
	
	
	
	
	
	
	
}
