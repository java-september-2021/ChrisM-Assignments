package com.chrism.eventsbeltreviewer.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.eventsbeltreviewer.authentication.models.Event;
import com.chrism.eventsbeltreviewer.authentication.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
	List<Message> findAll();
	List<Message> findByEventDiscussed(Event event);
	
}
