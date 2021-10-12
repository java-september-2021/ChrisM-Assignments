package com.chrism.dojooverflow.authentication.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.authentication.models.Message;
import com.chrism.dojooverflow.authentication.repositories.MessageRepository;

@Service
public class MessageService {
	@Autowired
	private MessageRepository mRepo;
	
	public List<Message> getAllMessages() {
		return this.mRepo.findAll();
	}
	
	public Message createMessage(Message message) {
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
