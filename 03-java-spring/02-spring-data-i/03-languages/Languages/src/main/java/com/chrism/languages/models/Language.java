package com.chrism.languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

@Validated
@Entity
@Table(name="languages")

public class Language {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(min = 2, max=200)
	private String languageName;
	@NotBlank
	@Size(min = 2, max=200)
	private String creatorName;
	@NotNull
	private 
}
