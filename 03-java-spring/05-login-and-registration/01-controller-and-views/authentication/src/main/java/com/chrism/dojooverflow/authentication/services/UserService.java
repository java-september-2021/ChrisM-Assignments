package com.chrism.dojooverflow.authentication.services;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.authentication.models.User;
import com.chrism.dojooverflow.authentication.repositories.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository uRepo;

    
    // register user and hash their password
    public User registerUser(User user) {
    	// Generate a Hash
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        // Set the hashed password on the users's password field
        user.setPassword(hashed);
        // Save the new password to the db
        return uRepo.save(user);
    }
    // find user by email
    public User findByEmail(String email) {
        return uRepo.findByEmail(email);
    }
    
    // find user by id
    public User findUserById(Long id) {
    	return this.uRepo.findById(id).orElse(null);
    }
    
    // authenticate user
    public boolean authenticateUser(String email, String password) {
        // find the user by email
    	User user = uRepo.findByEmail(email);
    	// if email found will return true and encrypt pw else will return false
    	if(user != null) {
    		return BCrypt.checkpw(password, user.getPassword());
    	}
       return false;
        
        
    }    
    
    public User getByEmail(String email) {
    	return this.uRepo.findByEmail(email);
    }
}

