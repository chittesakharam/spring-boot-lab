package com.nt.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendWelcomeMail(Employee employee) {
    	
    	

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(employee.getEmail());
        message.setSubject("Welcome to the Organization");

        String body =
                "Hello " + employee.getName() + ",\n\n" +
                "Welcome to our organization.\n" +
                "We are happy to have you on our team.\n\n" +
                "Regards,\n" +
                "HR Team";

        message.setText(body);

        mailSender.send(message);

        System.out.println("Welcome mail sent successfully...");
    }
}