package com.nt.service;

import com.nt.entity.Course;
import com.nt.entity.Student;

public interface IStudentCourseMgmtService {

    void  saveStudentsWithMultipleCourses(Student student);
    void  saveCourseWithMultipleStudent(Course course);

    void showStudentsWithCourses();

    void showCoursesWithStudetns();

}