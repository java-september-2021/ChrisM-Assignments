package com.chrism.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.models.Answer;
import com.chrism.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	private AnswerRepository aRepo;
	
	
	public List<Answer> allAnswers() {
		return this.aRepo.findAll();
	}
	
	public Answer createAnswer(Answer createAnswer) {
		return this.aRepo.save(createAnswer);
	}
	
	public Answer updateAnswer(Answer updateAnswer) {
		return this.aRepo.save(updateAnswer);
	}
	
	public Answer getOneAnswer(Long id) {
		return this.aRepo.findById(id).orElse(null);
	}
	
	public void deleteAnswer(Long id) {
		this.aRepo.deleteById(id);
	}

}
