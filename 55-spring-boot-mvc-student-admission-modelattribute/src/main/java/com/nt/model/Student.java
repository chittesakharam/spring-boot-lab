package com.nt.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {

	private Integer studentId;
	private String studentName;
	private String course;
	private Long mobileNo;
	
}
