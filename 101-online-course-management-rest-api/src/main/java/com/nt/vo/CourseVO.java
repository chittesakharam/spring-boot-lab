package com.nt.vo;

import lombok.Data;

@Data
public class CourseVO {
	
	private Integer courseId;
	private String courseName;
	private String instructor;
	private String category;
	private String duration;
	private Double price;
	private String description;

}

