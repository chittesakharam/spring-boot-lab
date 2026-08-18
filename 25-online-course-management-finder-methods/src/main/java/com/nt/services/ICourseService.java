package com.nt.services;

import java.util.List;

import com.nt.entity.Course;

public interface ICourseService {
	
	List<Course> findByCategory(String category);
	List<Course> findByInstructorName(String instructorName);
	List<Course> findByPriceLessThan(Double price);
	List<Course> findByPriceGreaterThan(Double price);
	List<Course>findByDuration(int hours);
	List<Course>findByRatingGreaterThanEqual(Double rating);
	List<Course>findByLanguage(String language);
	List<Course>findByCourseTitleContaining(String keyword);

}
