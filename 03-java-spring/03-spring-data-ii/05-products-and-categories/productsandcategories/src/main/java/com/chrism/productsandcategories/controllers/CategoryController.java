package com.chrism.productsandcategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.services.CategoryService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	private CategoryService cService;
	public CategoryController(CategoryService cService) {
		this.cService = cService;
	}
	
	@GetMapping("/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/new")
	public String createCategory(@ModelAttribute("category") Category category, BindingResult result) {
		Long categoryID = category.getId();
		if(result.hasErrors()) {
			return "newCategory.jsp";
		} else {
			this.cService.createCategory(category);
			return "redirect:/category/" + categoryID;
		}
		
	}
}
