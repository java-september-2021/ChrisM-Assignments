package com.chrism.eventsbeltreviewer.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chrism.eventsbeltreviewer.authentication.models.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findAll();
	List<Event> findByState(String state);
	List<Event> findByCity(String city);
	List<Event> findByStateIsNot(String state);
	List<Event> findByCityIsNot(String city);
}
