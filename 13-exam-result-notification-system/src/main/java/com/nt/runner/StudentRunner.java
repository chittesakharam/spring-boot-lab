package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Student;
import com.nt.service.EmailService;

@Component
public class StudentRunner implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) {

    	int id = Integer.parseInt(IO.readln("Enter Student ID : "));
    	String name = IO.readln("Enter Name: ");
    	String email = IO.readln("Enter Email: ");
    	double marks=Double.parseDouble(IO.readln("Enter Marks: "));
    	char grade = IO.readln("Enter Grade: ").toUpperCase().charAt(0);
        Student student =
                new Student(id,name,email,marks,grade);

        emailService.sendWelcomeMail(student);
    }
}