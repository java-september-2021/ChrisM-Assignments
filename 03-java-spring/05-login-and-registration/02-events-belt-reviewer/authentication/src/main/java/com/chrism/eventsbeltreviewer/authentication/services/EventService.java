package com.chrism.eventsbeltreviewer.authentication.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.eventsbeltreviewer.authentication.models.Event;
import com.chrism.eventsbeltreviewer.authentication.models.User;
import com.chrism.eventsbeltreviewer.authentication.repositories.EventRepository;

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
	
	//Adding the user to the event in order to track who made it.
	public Event createEvent(Event event, User user) {
		event.setEventCreator(user);
		return this.eRepo.save(event);
	}
	
	
	public void joinEvent(User user, Event event) {
		// Get list of users at event
		List<User> eventParticipants = event.getParticipants();
		// Add the user to the list
		eventParticipants.add(user);
		// Save the event afterwards
		this.eRepo.save(event);
	}
	
	
		public void unJoinEvent(User user, Event event) {
			// Get list of users at event
			List<User> eventParticipants = event.getParticipants();
			// Remove the user to the list
			eventParticipants.remove(user);
			// Save the event afterwards
			this.eRepo.save(event);
		}
	
	public Event getOneEvent(Long id) {
		return this.eRepo.findById(id).orElse(null);
	}
	
	public Event updateEvent(Event event) {
		return this.eRepo.save(event);
	}
	
	// I believe they said I was supposed to put more of the code in the service
	//So I beautified my code here and then used it to add in the controller
	public String formatDate(Event event) {
		SimpleDateFormat formattedDate = new SimpleDateFormat("MMMM dd, yyyy");
		String date = formattedDate.format(event.getEventDate());
		return date;
	}
	
	public List<String> eventDateListFormatter(List<Event> events) {
		ArrayList<String> dateList = new ArrayList<String>();
		for(Event event : events) {
			dateList.add(formatDate(event));
		}
		return dateList;
	}
	
	public void deleteEvent(Long id) {
		this.eRepo.deleteById(id);
	}

}
