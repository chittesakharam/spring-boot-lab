package com.nt.model;


import lombok.Data;

@Data
public class Review {

	private Integer id;
	private String reviewerName;
	private String productName;
	private Double rating;
	private String comment;
	
}
