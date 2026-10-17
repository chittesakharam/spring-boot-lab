package com.nt.service;

import java.util.List;

import com.nt.vo.CourseVO;

public interface CourseService {
	
	String addCourse(CourseVO course);
	
	List<CourseVO> viewAllCourses();
	CourseVO getCourseById(Integer id);
	String updateCourse(Integer id,CourseVO course);
	String deleteCourse(Integer id);

}
