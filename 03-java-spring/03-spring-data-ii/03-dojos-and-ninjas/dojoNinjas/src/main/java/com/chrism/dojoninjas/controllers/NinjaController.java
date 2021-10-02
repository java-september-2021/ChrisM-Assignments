package com.chrism.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.dojoninjas.models.Dojo;
import com.chrism.dojoninjas.models.Ninja;
import com.chrism.dojoninjas.services.DojoService;
import com.chrism.dojoninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	private NinjaService ninjaService;
	private DojoService dojoService;
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@GetMapping("/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", this.dojoService.allDojos());
		return "ninja.jsp";
	}
	
	@PostMapping("/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		Long idDojo = ninja.getDojo().getId();
		if(result.hasErrors()) {
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninja/show/" + idDojo;
		}
	}
	
	@GetMapping("/show/{id}")
	public String showDojo(@PathVariable("id") Long id, Model viewModel) {
		Dojo thisDojo = this.dojoService.getOneDojo(id);
		viewModel.addAttribute("thisDojo", thisDojo);
		return "showDojo.jsp";
	}

}
