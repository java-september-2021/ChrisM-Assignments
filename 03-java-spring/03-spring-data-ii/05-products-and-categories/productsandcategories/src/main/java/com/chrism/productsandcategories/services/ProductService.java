package com.chrism.productsandcategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.models.Product;
import com.chrism.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	private ProductRepository pRepo;
	public ProductService(ProductRepository pRepo) {
		this.pRepo = pRepo;
	}
	
	public List<Product> allProducts() {
		return this.pRepo.findAll();
	}
	
	public Product createProduct(Product createProd) {
		return this.pRepo.save(createProd);
	}
	
	public Product getOneProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public Product updateProduct(Product updateProd) {
		return this.pRepo.save(updateProd);
	}
	
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
	
	public List<Product> findProductsInCategory(Category category) {
		return this.pRepo.findAllByCategory(category);
	}
	
	public List<Product> findProductsNotInCategory(Category category) {
		return this.pRepo.findByCategoryNotContains(category);
	}
	
	
	
	
}
