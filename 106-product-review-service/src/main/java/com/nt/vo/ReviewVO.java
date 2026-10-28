package com.nt.vo;

import lombok.Data;

@Data
public class ReviewVO{

	private Integer id;
	private String reviewerName;
	private String productName;
	private Double rating;
	private String comment;
	
}
