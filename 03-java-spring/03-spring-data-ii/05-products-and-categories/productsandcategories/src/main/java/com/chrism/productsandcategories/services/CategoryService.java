package com.chrism.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.models.Product;
import com.chrism.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	private CategoryRepository cRepo;
	public CategoryService(CategoryRepository cRepo) {
		this.cRepo = cRepo;
	}
	
	public List<Category> allCategories() {
		return this.cRepo.findAll();
	}
	
	public Category createCategory(Category newCat) {
		return this.cRepo.save(newCat);
	}
	
	public Category updateCategory(Category updateCat) {
		return this.cRepo.save(updateCat);
	}
	
	public Category getOneCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	public void deleteCategory(Long id) {
		this.cRepo.deleteById(id);
	}
	
	public List<Category> findCategoriesByProduct(Product product) {
		return this.cRepo.findAllByProducts(product);
	}
	
	public List<Category> findCategoryNotOnProduct(Product product) {
		return this.cRepo.findByProductsNotContains(product);
	}
	
}
