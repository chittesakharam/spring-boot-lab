package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.CourseService;
import com.nt.vo.CourseVO;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	private final CourseService service;

	public CourseController(CourseService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<String> addCourse(@RequestBody CourseVO course)
	{
		String  addMsg = service.addCourse(course);
		return new ResponseEntity<String>(addMsg,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<CourseVO>> viewAllCourses()
	{
		List<CourseVO> viewAllCourses = service.viewAllCourses();
		return new ResponseEntity<List<CourseVO>> (viewAllCourses,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<CourseVO> getCourseById(@PathVariable Integer id)
	{
		CourseVO course = service.getCourseById(id);
		return new ResponseEntity<CourseVO> (course,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateCourse(@PathVariable Integer id,@RequestBody CourseVO course)
	{
		String updateCourse = service.updateCourse(id, course);
		return new ResponseEntity<String> (updateCourse,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Integer id)
	{
		String deleteCourse = service.deleteCourse(id);
		return new ResponseEntity<String> (deleteCourse,HttpStatus.OK);
	}

}
