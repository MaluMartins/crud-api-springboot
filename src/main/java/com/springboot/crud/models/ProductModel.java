package com.springboot.crud.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //gerar id automaticamente
	private UUID idProduct; //ids distribuidos
	private String name;
	private BigDecimal value;
	
	//getters and setters
	public UUID getIdProduct() {
		return idProduct;
	}
	
	public void setIdProduct(UUID idProduct) {
		this.idProduct = idProduct;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getValue() {
		return value;
	}
	
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	
	
}
