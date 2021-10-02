package com.chrism.dojoninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.dojoninjas.models.Ninja;
import com.chrism.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinjas() {
		return this.ninjaRepo.findAll();
	}
	
	public Ninja createNinja(Ninja newNinja) {
		return this.ninjaRepo.save(newNinja);
	}
	
	public Ninja updateNinja(Ninja updateNinja) {
		return this.ninjaRepo.save(updateNinja);
	}
	
	public Ninja getOneNinja(Long id) {
		return this.ninjaRepo.findById(id).orElse(null);
	}

	public void deleteNinja(Long id) {
		this.ninjaRepo.deleteById(id);
	}
}
