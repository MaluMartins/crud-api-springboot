package com.springboot.crud.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.models.ProductModel;
import com.springboot.crud.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public ProductModel findById(UUID id) {
		return productRepository.findById(id).get();
		
	}
}
