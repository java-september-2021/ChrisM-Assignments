package com.chrism.dojooverflow.authentication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.authentication.models.Event;
import com.chrism.dojooverflow.authentication.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eRepo;
	
	public List<Event> findAll() {
		return this.eRepo.findAll();
	}
	
	public List<Event> getEventsByState(String state) {
		return this.eRepo.findByState(state);
	}
	
	public List<Event> getOutOfStateEvents(String state) {
		return this.eRepo.findByStateIsNot(state);
	}
	
	public List<Event> getEventsByCity(String city) {
		return this.eRepo.findByCity(city);
	}
	
	public List<Event> getOutOfTownEvents(String city) {
		return this.eRepo.findByCityIsNot(city);
	}
	
	public Event createEvent(Event event) {
		return this.eRepo.save(event);
	}
	
	public Event getOneEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	
	public Event updateEvent(Event event) {
		return this.eRepo.save(event);
	}
	
	public void deleteEvent(Long id) {
		this.eRepo.deleteById(id);
	}

}
