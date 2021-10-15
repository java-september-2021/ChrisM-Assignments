package com.chrism.eventsbeltreviewer.authentication.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.chrism.eventsbeltreviewer.authentication.models.User;
import com.chrism.eventsbeltreviewer.authentication.repositories.UserRepository;

@Component
public class UserValidator {
	@Autowired
	private UserRepository uRepo;

	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if(!user.getPasswordConfirmation().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match", "Password and confirmation do not match.");
		}
		
		if(this.uRepo.existsByEmail(user.getEmail())) {
			errors.rejectValue("email", "Unique", "email already registered");
		}
	}
	
}
