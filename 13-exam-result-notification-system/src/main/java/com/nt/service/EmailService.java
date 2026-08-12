package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.nt.model.Student;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeMail(Student student) {
    	
    	

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(student.getEmail());
        message.setSubject("Result Generated Successfully");

        String body =
                "Student Name: " + student.getStudentName() + ",\n" +
                "Marks: " +student.getMarks()+"\n"+
                "Grade: " + student.getGrage();

        message.setText(body);

        mailSender.send(message);

        IO.println(body);
       IO.println("Mail sent successfully...");
    }
}