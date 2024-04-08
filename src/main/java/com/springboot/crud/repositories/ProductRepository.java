package com.springboot.crud.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID>{}
