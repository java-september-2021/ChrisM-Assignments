package com.chrism.productsandcategories.controllers;

import javax.validation.Valid;

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
@RequestMapping("/product")
public class ProductController {
	private ProductService pService;
	private CategoryService cService;
	public ProductController(ProductService pService, CategoryService cService) {
		this.pService = pService;
		this.cService = cService;
	}
	
	@GetMapping("/new")
	public String newProduct(@ModelAttribute("product") Product product) {
		return "newProduct.jsp";
	}
	
	@PostMapping("/new")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		} else {
			this.pService.createProduct(product);
			return "redirect:/product/new";
		}
	}
	
	@GetMapping("/{id}")
	public String showProduct(@PathVariable("id") Long id, Model viewModel) {
		Product thisProduct = pService.getOneProduct(id);
		viewModel.addAttribute("thisProduct", thisProduct);
		viewModel.addAttribute("categories", this.cService.findCategoryNotOnProduct(thisProduct));
		return "showProduct.jsp";
	}
	
	@PostMapping("/{id}")
	public String addCategoryToProduct(@PathVariable("id") Long id, @RequestParam(value="categoryToAdd") String catID) {
		Product thisProduct = pService.getOneProduct(id);
		Long prodID = thisProduct.getId();
		Long cID = Long.valueOf(catID);
		Category thisCategory = cService.getOneCategory(cID);
		thisProduct.getCategory().add(thisCategory);
		this.pService.updateProduct(thisProduct);
		return "redirect:/product/" + prodID;
	}
	

}
