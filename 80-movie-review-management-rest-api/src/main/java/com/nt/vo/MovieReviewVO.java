package com.nt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

@NoArgsConstructor
public class MovieReviewVO {
	
	
	private String movieName;
	private String reviewerName;
	private double rating;
	private String reviewCmment;
	

}
