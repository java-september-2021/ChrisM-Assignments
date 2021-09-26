package com.chrism.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.languages.models.Language;
import com.chrism.languages.repositories.LanguageRepository;

@Service
public class LanguageService {

	private LanguageRepository lRepo;
	public LanguageService(LanguageRepository lRepo) {
		this.lRepo = lRepo;
	}
	
	public List<Language> allLanguages() {
		return lRepo.findAll();
	}
	
	public Language createLanguage(Language newLanguage) {
		return lRepo.save(newLanguage);
	}
	
	public Language findLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public Language updateLanguage(Language thisLanguage) {
		return this.lRepo.save(thisLanguage);
	}
	
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
