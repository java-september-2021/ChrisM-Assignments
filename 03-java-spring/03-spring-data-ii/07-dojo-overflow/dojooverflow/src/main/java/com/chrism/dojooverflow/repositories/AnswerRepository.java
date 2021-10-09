package com.chrism.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.dojooverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List<Answer> findAll();
	
}
