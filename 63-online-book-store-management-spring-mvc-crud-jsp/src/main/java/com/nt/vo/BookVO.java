package com.nt.vo;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("bookVO")
public class BookVO {
	
	private Integer id;
	private String title;
	private String author;
	private String category;
	private Double price;
	private String publisher;
	private String publishedDate;
	private Integer stockQuantity;
	

}
