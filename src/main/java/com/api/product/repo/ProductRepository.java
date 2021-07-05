package com.api.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
