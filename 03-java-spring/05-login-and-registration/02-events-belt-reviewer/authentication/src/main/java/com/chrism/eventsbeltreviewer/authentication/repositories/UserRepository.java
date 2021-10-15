package com.chrism.eventsbeltreviewer.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chrism.eventsbeltreviewer.authentication.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
	boolean existsByEmail(String email);
}
