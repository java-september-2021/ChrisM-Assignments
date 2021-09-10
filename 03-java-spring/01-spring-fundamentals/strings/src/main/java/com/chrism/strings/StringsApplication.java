package com.chrism.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}

	@RequestMapping("/")
	public String hi() {
		return "Hi, How are you?";
	}
	
	@RequestMapping("/random") 
	public String spring() {
		return "This Strings page brought to you by Spring Boot";
	}
	
}
