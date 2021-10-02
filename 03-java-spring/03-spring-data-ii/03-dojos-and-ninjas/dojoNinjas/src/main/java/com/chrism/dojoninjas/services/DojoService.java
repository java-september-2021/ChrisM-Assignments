package com.chrism.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.dojoninjas.models.Dojo;
import com.chrism.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private DojoRepository dojoRepo;
	public DojoService(DojoRepository dojoRepo) {
		this.dojoRepo = dojoRepo;
	}

	public List<Dojo> allDojos() {
		return this.dojoRepo.findAll();
	}
	
	public Dojo createDojo(Dojo newDojo) {
		return this.dojoRepo.save(newDojo);
	}
	
	public Dojo updateDojo(Dojo updateDojo) {
		return this.dojoRepo.save(updateDojo);
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dojoRepo.findById(id).orElse(null);
	}
	
	public void deleteDojo(Long id) {
		this.dojoRepo.deleteById(id);
	}
}
