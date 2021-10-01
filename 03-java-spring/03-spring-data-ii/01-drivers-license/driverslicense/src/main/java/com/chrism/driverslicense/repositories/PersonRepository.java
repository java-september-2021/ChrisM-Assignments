package com.chrism.driverslicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.driverslicense.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findAll();
	
}
