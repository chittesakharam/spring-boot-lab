package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class Book {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "book_Id",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(length=30)
	private String title;
	@Column(length=30)
	private String author;
	@Column(length=30)
	private String category;
	private Double price;
	@Column(length=30)
	private String publisher;
	@Column(length=30)
	private String publishedDate;
	private Integer stockQuantity;
	public Book(String title, String author, String category, Double price, String publisher, String publishedDate,
			Integer stockQuantity) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		this.publisher = publisher;
		this.publishedDate = publishedDate;
		this.stockQuantity = stockQuantity;
	}
	
	
	

}
