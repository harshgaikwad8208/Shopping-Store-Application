package com.boostmytool.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boostmytool.beststore.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
