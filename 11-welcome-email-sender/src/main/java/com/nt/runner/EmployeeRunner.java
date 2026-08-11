package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Employee;
import com.nt.service.EmailService;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private EmailService emailService;

    @Override
    public void run(String... args) {

        Employee employee =
                new Employee("Sakharam", "sahhu999@gmail.com");

        emailService.sendWelcomeMail(employee);
    }
}