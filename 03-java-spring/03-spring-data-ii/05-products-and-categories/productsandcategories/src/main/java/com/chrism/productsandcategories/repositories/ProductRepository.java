package com.chrism.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chrism.productsandcategories.models.Category;
import com.chrism.productsandcategories.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findAllByCategory(Category category);
	List<Product> findByCategoryNotContains(Category category);
}
