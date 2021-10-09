package com.chrism.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chrism.dojooverflow.models.Question;
import com.chrism.dojooverflow.models.Tag;
import com.chrism.dojooverflow.services.QuestionService;
import com.chrism.dojooverflow.services.TagService;
import com.chrism.dojooverflow.validator.TagValidator;

@Controller
@RequestMapping("/questions")
public class QuestionController {
	@Autowired
	private QuestionService qService;
	
	@Autowired
	private TagService tService;
	
	@Autowired
	private TagValidator tValidator;
	
	
	@GetMapping("")
	public String questionHome(Model viewModel) {
		viewModel.addAttribute("allQuestions", this.qService.allQuestions());
		return "questionDashboard.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/new")
	public String createQuestion(@Valid @ModelAttribute("question") Question question, @RequestParam("frontEndTagsToSplit") String tag, BindingResult result) {
		//tValidator.validate(question, result);
		//if(result.hasErrors()) {
			//return "newQuestion.jsp";
	//	} 
		Question newQuestion = qService.createQuestion(question);
		String[] tagList = tag.split(", ");
		for(int i=0; i < tagList.length; i++) {
			//create a tag object
			Tag newTag = this.tService.findBySubject(tagList[i]);
			//Check for tag in db
			//if(newTag == null) {
				//newTag = this.tService.createTag(new Tag(tagList[i]));
				//newTag = this.tService.createTag(newTag);
			//} 
			this.qService.tagQuestion(newQuestion, newTag);
		}
		return "redirect:/";
	}
	
	
	

}
