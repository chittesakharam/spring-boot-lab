package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Course {
	
	@Id
	private Long courseId;
	@Column(length=30)
	private String courseTitle;
	@Column(length=30)
	private String category;
	@Column(length=30)
	private String instructorName;
	private Double price;
	private Integer durationINHours;
	private Double rating;
	@Column(length=30)
	private String language;
	
	
	public Course() {
		super();
	}
	public Course(Long courseId, String courseTitle, String instructorName, Double price, Integer durationINHours,
			Double rating, String language) {
		super();
		this.courseId = courseId;
		this.courseTitle = courseTitle;
		this.instructorName = instructorName;
		this.price = price;
		this.durationINHours = durationINHours;
		this.rating = rating;
		this.language = language;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getDurationINHours() {
		return durationINHours;
	}
	public void setDurationINHours(Integer durationINHours) {
		this.durationINHours = durationINHours;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", instructorName=" + instructorName
				+ ", price=" + price + ", durationINHours=" + durationINHours + ", rating=" + rating + ", language="
				+ language + "]";
	}
	
	
	
}
