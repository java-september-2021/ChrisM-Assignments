package com.chrism.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrism.dojooverflow.models.Tag;
import com.chrism.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	public List<Tag> allTags(){
		return this.tRepo.findAll();
	}
	
	public Tag createTag(Tag createTag) {
		return this.tRepo.save(createTag);
	}
	
	public Tag updateTag(Tag updateTag) {
		return this.tRepo.save(updateTag);
	}
	
	public Tag getOneTag(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
	
	public Tag findBySubject(String subject) {
		Tag tagToAdd = this.tRepo.getBySubject(subject).orElse(null);
		if(tagToAdd == null) {
			tagToAdd = new Tag(subject);
			return this.tRepo.save(tagToAdd);
		}
		return tagToAdd;
	}

	public void deleteTag(Long id) {
		this.tRepo.deleteById(id);
	}
}
