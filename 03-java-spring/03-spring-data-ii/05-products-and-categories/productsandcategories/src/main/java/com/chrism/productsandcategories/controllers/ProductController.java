package com.chrism.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chrism.productsandcategories.models.Product;
import com.chrism.productsandcategories.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	private ProductService pService;
	public ProductController(ProductService pService) {
		this.pService = pService;
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
	

}
