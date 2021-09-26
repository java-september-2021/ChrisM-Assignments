package com.chrism.languages.controllers;

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
import org.springframework.web.bind.annotation.RequestMethod;

import com.chrism.languages.models.Language;
import com.chrism.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class HomeController {
	private LanguageService lService;
	public HomeController(LanguageService lService) {
		this.lService = lService;
	}

	    @RequestMapping("")
	    public String index(Model viewModel) {
	    	List<Language> languages = lService.allLanguages();
	    	viewModel.addAttribute("languages", languages);
	        return "index.jsp";
	    }
	    
	    
	    @RequestMapping("/new")
	    public String newLanguage(@ModelAttribute("language") Language language) {
	    	return "new.jsp";
	    }
	   
	    @PostMapping("/new")
	    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	    	if(result.hasErrors()) {
	    		return "new.jsp";
	    	} else {
	    		lService.createLanguage(language);
	    		return "redirect:/languages";
	    	}
	    }
	    
	    @GetMapping("/{id}")
	    public String show(@PathVariable("id") Long id, Model viewModel) {
	    	Language thisLanguage = lService.findLanguage(id);
	    	viewModel.addAttribute("thisLanguage", thisLanguage);
	    	return ("show.jsp");
	    }
	    
	    @RequestMapping(value="/{id}/delete")
	    public String delete(@PathVariable("id") Long id) {
	    	lService.deleteLanguage(id);
	    	return "redirect:/languages";
	    }
	    
	    @GetMapping(value="/{id}/edit")
	    public String editLanguage(@PathVariable("id") Long id, @ModelAttribute("thisLanguage") Language thisLanguage, Model viewModel) {
	       	viewModel.addAttribute("thisLanguage", this.lService.findLanguage(id));
	    	return ("edit.jsp");
	    }
	    
	    @PostMapping("/{id}/edit")
	    public String edit(@Valid @ModelAttribute("thisLanguage") Language thisLanguage, BindingResult result, @PathVariable("id") Long id) {
	    	if(result.hasErrors()) {
	    		return "edit.jsp";
	    	} else {
	    		lService.updateLanguage(thisLanguage);
	    		return "redirect:/languages";
	    	}
	    }
	    
	    
	    
}

