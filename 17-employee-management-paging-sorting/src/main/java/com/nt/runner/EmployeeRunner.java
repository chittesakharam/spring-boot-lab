package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeServices;

@Component
public class EmployeeRunner implements CommandLineRunner {

    @Autowired
    private IEmployeeServices service;

    @Override
    public void run(String... args) throws Exception {

    	IO.println("===== PAGE 1 =====");

        service.getEmployeesByPage(0, 3)
               .forEach(IO::println);

        IO.println("\n===== PAGE 2 =====");

        service.getEmployeesByPage(1, 3)
        .forEach(IO::println);

        IO.println("\n===== SORT BY SALARY =====");

        service.getEmployeesSortedBySalary()
        .forEach(IO::println);

        IO.println("\n===== SORT BY NAME =====");

        service.getEmployeesSortedByName()
        .forEach(IO::println);
        IO.println("\n=====  =====");
        service.getEmployeesSortedByName().stream().filter(emp -> emp.getDepartment().toLowerCase().contains("nan")).forEach(IO::println);
        
        
        }
}