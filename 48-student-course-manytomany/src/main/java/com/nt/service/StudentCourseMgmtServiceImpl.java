package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Course;
import com.nt.entity.Student;
import com.nt.repository.ICourseRepository;
import com.nt.repository.IStudentRepository;

@Service
public class StudentCourseMgmtServiceImpl implements IStudentCourseMgmtService {

    @Autowired
    private IStudentRepository studentRepo;

    @Autowired
    private ICourseRepository courseRepo;

  


	@Override
	public void saveStudentsWithMultipleCourses(Student student) {
		Integer id = studentRepo.save(student).getId();
		IO.println(id+" With Student Saved ");
		
	}

	@Override
	public void saveCourseWithMultipleStudent(Course course) {
		Integer id = courseRepo.save(course).getId();
		IO.println(id+" Course Saved");
		
	}

	@Override
	public void showStudentsWithCourses() {
		studentRepo.findAll().forEach(std ->{
			IO.println(std);
			std.getCourses().forEach(IO::println);
		});

		
	}

	@Override
	public void showCoursesWithStudetns() {
		 List<Course> list=courseRepo.findAll();

	        list.forEach(course->{

	           IO.println(course);

	            course.getStudents().forEach(student->{
	               IO.println("   "+student);
	            });

	        });

		
	}

}