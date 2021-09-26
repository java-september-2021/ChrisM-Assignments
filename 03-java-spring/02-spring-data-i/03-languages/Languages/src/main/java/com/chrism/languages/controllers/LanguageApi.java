package com.chrism.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chrism.languages.models.Language;
import com.chrism.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class LanguageApi {
	private LanguageService lService;
	public LanguageApi(LanguageService lService) {
		this.lService = lService;
	}
	
	@RequestMapping("")
	public List<Language> index() {
		return lService.allLanguages();
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public Language create(@RequestParam(value="creator") String creator, 
			@RequestParam(value="languageName")String languageName, 
			@RequestParam(value="version")String version) {
		Language newLanguage = new Language(creator, languageName, version);
		return lService.createLanguage(newLanguage);
	}
	
	@RequestMapping(value="/languages/{id}")
	public Language show(@PathVariable("id") Long id) {
		Language language = lService.findLanguage(id);
		return language;
	}
	
	//TODO: Put doesn't seem to work, Come back to this
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public Language update(@PathVariable("id") Long id, Language newLanguage) {
		return this.lService.updateLanguage(newLanguage);
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
	}
	
}
