package com.chrism.eventsbeltreviewer.authentication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.eventsbeltreviewer.authentication.models.Event;
import com.chrism.eventsbeltreviewer.authentication.models.Message;
import com.chrism.eventsbeltreviewer.authentication.models.User;
import com.chrism.eventsbeltreviewer.authentication.repositories.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository mRepo;
	
	public List<Message> getAllMessages() {
		return this.mRepo.findAll();
	}
	
	public List<Message> getByEvent(Event event) {
		return this.mRepo.findByEventDiscussed(event);
	}
	
	
	public Message createMessage(Message message, Event event, User user) {
		message.setEventDiscussed(event);
		message.setMessageCreator(user);
		return this.mRepo.save(message);
	}
	
	public Message getOneMessage(Long id) {
		return this.mRepo.findById(id).orElse(null);
	}
	
	public Message updateMessage(Message message) {
		return this.mRepo.save(message);
	}
	
	public void deleteMessage(Long id) {
		this.mRepo.deleteById(id);
	}
	
}
