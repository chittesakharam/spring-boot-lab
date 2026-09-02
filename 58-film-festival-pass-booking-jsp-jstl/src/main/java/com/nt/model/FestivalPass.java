package com.nt.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("fPass")
public class FestivalPass {

	private Integer passId;
	private String visitorName="Scott";
	private String nationality;
	private String festivalCategory;
	private String passType;
	private String visitingDays;
	private String email;
	
	
}
