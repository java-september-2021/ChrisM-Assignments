package com.chrism.dojooverflow.validator;

import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.chrism.dojooverflow.models.Question;
import com.chrism.dojooverflow.repositories.QuestionRepository;

@Component
public class TagValidator {
	@Autowired
	private QuestionRepository qRepo;
	//1
	
	public boolean supports(Class<?> clazz) {
		return Question.class.equals(clazz);
	}
	
	//2
	
	public void validate(Object target, Errors errors) {
		Question question = (Question) target;
		String[] tags = question.getFrontEndTagsToSplit().split(", ");
		if(tags.length > 3) {
			//3
			errors.rejectValue("frontEndTagsToSplit", "ThreeOrLess", "Only 3 tags are allowed per question.");
		}
	}
}
