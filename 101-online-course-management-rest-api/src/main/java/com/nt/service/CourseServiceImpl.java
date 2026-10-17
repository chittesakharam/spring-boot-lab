package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.Course;
import com.nt.repository.CourseRepository;
import com.nt.vo.CourseVO;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository repo;
	
	
	public CourseServiceImpl(CourseRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addCourse(CourseVO course) {
		  Course entity = new Course();
		  BeanUtils.copyProperties(course, entity,"courseId");
		  Integer id = repo.save(entity).getCourseId();
		return "Course Added with id:: "+id;
	}

	@Override
	public List<CourseVO> viewAllCourses() {
		 List<CourseVO> list = repo.findAll().stream().map(entity->{
			 CourseVO vo = new CourseVO();
			 BeanUtils.copyProperties(entity, vo);
			 return vo;
		 }).toList();
		return list;
	}

	@Override
	public CourseVO getCourseById(Integer id) {
		Course entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id: "));
		CourseVO vo = new CourseVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}

	@Override
	public String updateCourse(Integer id, CourseVO course) {
		Course entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id: "));
		BeanUtils.copyProperties(course, entity);
		repo.save(entity);
		return id+" Course Updated";
	}

	@Override
	public String deleteCourse(Integer id) {
		Course entity = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id: "));
		repo.delete(entity);
		return id+" Course are Deleted";
	}

}
