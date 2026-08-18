package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Course;

public interface ICourseRepository extends JpaRepository<Course, Long> {

	List<Course> findByCategory(String category);

	List<Course> findByInstructorName(String instructorName);

	List<Course> findByPriceLessThan(Double price);

	List<Course> findByPriceGreaterThan(Double price);

	List<Course> findByDurationINHoursGreaterThan(int hr);

	List<Course> findByRatingGreaterThanEqual(Double rating);

	List<Course> findByLanguage(String language);

	List<Course> findByCourseTitleContaining(String keyword);

}
