package com.nt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Course;
import com.nt.repository.ICourseRepository;
@Service
public class CourseService implements ICourseService {
	@Autowired
  private ICourseRepository repo;
	@Override
	public List<Course> findByCategory(String category) {
		 return repo.findByCategory(category);
		
	}

	@Override
	public List<Course> findByInstructorName(String instructorName) {
		
		return repo.findByInstructorName(instructorName);
	}

	@Override
	public List<Course> findByPriceLessThan(Double price) {
		
		return repo.findByPriceLessThan(price);
	}

	@Override
	public List<Course> findByPriceGreaterThan(Double price) {
		
		return  repo.findByPriceGreaterThan(price);
	}


	@Override
	public List<Course> findByRatingGreaterThanEqual(Double rating) {
		
		return repo.findByRatingGreaterThanEqual(rating);
	}

	@Override
	public List<Course> findByLanguage(String language) {
		
		return repo.findByLanguage(language);
	}

	@Override
	public List<Course> findByCourseTitleContaining(String keyword) {
		
		return  repo.findByCourseTitleContaining(keyword);
	}

	@Override
	public List<Course> findByDuration(int hours) {
		// TODO Auto-generated method stub
		return  repo.findByDurationINHoursGreaterThan(hours);
	}

}
