package com.chrism.driverslicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.driverslicense.models.Person;
import com.chrism.driverslicense.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository pRepo;
	public PersonService(PersonRepository pRepo) {
		this.pRepo = pRepo;
	}
	
	public List<Person> allPeople() {
		return this.pRepo.findAll();
	}
	
	public Person createPerson(Person createPerson) {
		return this.pRepo.save(createPerson);
	}
	
	public Person updateperson(Person updatePerson) {
		return this.pRepo.save(updatePerson);
	}
	
	public Person getOnePerson(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public void deletePerson(Long id) {
		this.pRepo.deleteById(id);
	}
}
