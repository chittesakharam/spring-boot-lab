package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository repo;
	@Override
	public String registerStudent(Student std) {
		
		repo.save(std);
		
		return "Student Added Successfully..";
	}

	@Override
	public Iterable<Student> getAllStudents() {
		
		 Iterable<Student> all = repo.findAll();
		 
		return all;
	}

	@Override
	public Student getStudentById(int id) {
		Student std = repo.findById(id).get();
		return std;
	}

	@Override
	public String updateCourse(int id, String course) {
		Student s =repo.findById(id).get();
		s.setCourseName(course);
		repo.save(s);
		return "Course Update Successfully";
	}

	@Override
	public String deleteStudent(int id) {
		 Student std = repo.findById(id).get();
		 repo.delete(std);
		 
		return "Student Record deleted ";
	}

	@Override
	public int countStudents() {
		long count = repo.count();
		return (int)count;
	}

}
