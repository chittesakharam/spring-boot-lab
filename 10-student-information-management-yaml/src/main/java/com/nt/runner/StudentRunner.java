package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.Student;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private Student student;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Student Details-------");

        System.out.println("Id          : " + student.getId());

        System.out.println("Name        : " + student.getName());

        System.out.println("Course      : " + student.getCourse());

        System.out.println("Fee         : " + student.getFee());

        System.out.println("Institute   : " + student.getInstitute());

        System.out.println("Subjects    : " + student.getSubjects());

        System.out.println("Marks       : " + student.getMarks());
    }
}