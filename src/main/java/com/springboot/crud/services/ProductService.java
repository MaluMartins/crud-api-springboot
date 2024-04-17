package com.springboot.crud.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.models.ProductModel;
import com.springboot.crud.repositories.ProductRepository;
import com.springboot.crud.services.exceptions.EntityNotFoundException;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public ProductModel findById(UUID id) {
		return productRepository.findById(id).orElseThrow(
				() -> new EntityNotFoundException("Id not found: " + id));
		
	}
}
