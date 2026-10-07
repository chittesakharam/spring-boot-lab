package com.nt.model;


import lombok.Data;

@Data
public class Product {
	private Integer id;
	private String name;
	private String category;
	private Double price;
	private Integer quantity;

}
