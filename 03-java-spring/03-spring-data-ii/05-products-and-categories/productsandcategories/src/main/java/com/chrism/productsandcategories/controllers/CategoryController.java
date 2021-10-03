package com.chrism.productsandcategories.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.models.Product;
import com.chrism.productsandcategories.services.CategoryService;
import com.chrism.productsandcategories.services.ProductService;

@Controller
@RequestMapping("/category")
public class CategoryController {
	private CategoryService cService;
	private ProductService pService;
	public CategoryController(CategoryService cService, ProductService pService) {
		this.cService = cService;
		this.pService = pService;
	}
	
	@GetMapping("/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/new")
	public String createCategory(@ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		} else {
			this.cService.createCategory(category);
			Long categoryID = category.getId();
			return "redirect:/category/" + categoryID;
		}
	}
	
	@GetMapping("/{id}")
	public String showCategory(@PathVariable("id") Long id, Model viewModel) {
		Category thisCategory = this.cService.getOneCategory(id);
		viewModel.addAttribute("products", this.pService.findProductNotInCategory(thisCategory));
		viewModel.addAttribute("thisCategory", thisCategory);
		return "showCategory.jsp";
	}
	
	@PostMapping("/{id}")
	public String addProductToCategory(@PathVariable("id") Long id, @RequestParam(value="productToAdd") String productID) {
		Category thisCategory = cService.getOneCategory(id);
		Long catID = thisCategory.getId();
		Long pID = Long.valueOf(productID);
		Product thisProduct = pService.getOneProduct(pID);
		thisCategory.getProducts().add(thisProduct);
		this.cService.updateCategory(thisCategory);
		return "redirect:/category/" + catID;
	}
	
	
}
