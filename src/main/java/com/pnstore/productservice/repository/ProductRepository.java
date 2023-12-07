package com.pnstore.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pnstore.productservice.model.Product;



public interface ProductRepository extends MongoRepository<Product, String> {

}
