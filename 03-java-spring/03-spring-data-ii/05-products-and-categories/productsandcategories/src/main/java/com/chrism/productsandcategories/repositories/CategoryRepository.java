package com.chrism.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.models.Product;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);

	
}
