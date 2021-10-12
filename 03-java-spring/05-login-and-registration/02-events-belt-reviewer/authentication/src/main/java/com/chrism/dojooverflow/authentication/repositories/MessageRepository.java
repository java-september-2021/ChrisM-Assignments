package com.chrism.dojooverflow.authentication.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.dojooverflow.authentication.models.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
	List<Message> findAll();
}
