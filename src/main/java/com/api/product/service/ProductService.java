package com.api.product.service;

import java.util.List;
import java.util.Optional;

import com.api.product.entity.Product;

public interface ProductService {
	Product save(Product product);

	void deleteById(Long id);

	Optional<Product> findById(Long id);

	List<Product> findAll();
}
