package com.chrism.dojooverflow.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.dojooverflow.authentication.models.Event;

public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findAll();
	List<Event> findByState(String state);
	List<Event> findByCity(String city);
	List<Event> findByStateIsNot(String state);
	List<Event> findByCityIsNot(String city);
}
