package com.chrism.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.models.Question;
import com.chrism.dojooverflow.models.Tag;
import com.chrism.dojooverflow.repositories.QuestionRepository;
// I moved this file.  Keep an eye out for errors!!!
@Service
public class QuestionService {
	@Autowired
	private QuestionRepository qRepo;
	
	public List<Question> allQuestions() {
		return this.qRepo.findAll();
	}
	
	//Add tag to question
	public Question tagQuestion(Question question, Tag tag) {
		//Get list of tags from the question object
		List<Tag> questionTags = question.getTags();
		//Add this tag to the list
		questionTags.add(tag);
		//Save the question object
		return this.qRepo.save(question);
	}
	
	public Question createQuestion(Question createQuestion) {
		return this.createQuestion(createQuestion);
	}
	
	public Question updateQuestion(Question updateQuestion) {
		return this.updateQuestion(updateQuestion);
	}
	
	public Question getOneQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	
	public void deleteQuestion(Long id) {
		this.qRepo.deleteById(id);
	}
	
}
