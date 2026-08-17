package com.nt.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.services.EmployeeService;

@Component
public class PayrollRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService service;

    @Override
    public void run(String... args) throws Exception {

       

        do {

            IO.println("\n===== Employee Payroll System =====");
            IO.println("1. Register Employee");
            IO.println("2. Display All Employees");
            IO.println("3. Search Employee");
            IO.println("4. Update Employee");
            IO.println("5. Delete Employee");
            IO.println("6. Exit");

            int choice=Integer.parseInt(IO.readln("Enter your choice"));

            switch(choice) {
                 
                case 1->{

                    int id = Integer.parseInt(IO.readln("Employee Id : "));
                
                  
                   
                    String name =  IO.readln("Employee Name : ");

             
                    String dept =  IO.readln("Department : ");

                 
                    String desig =  IO.readln("Employee designation : ");

                    
                    double salary = Double.parseDouble(IO.readln("Enter Basic Salary:"));

                 
                    double bonus = Double.parseDouble(IO.readln("Enter bonus Salary:"));
                    int exp=Integer.parseInt(IO.readln("Enter Expirience"));
                     Employee emp = new Employee(id, name, dept, desig,salary, bonus, exp);

                    service.addEmployee(emp);
                }

                case 2-> service.viewAllEmployees();
               

                case 3->{

                	int id = Integer.parseInt(IO.readln("Employee Id : "));
                    service.searchEmployee(id);
                }

                case 4->{

                	int id = Integer.parseInt(IO.readln("Employee Id : "));
                	double salary = Double.parseDouble(IO.readln("Enter New Salary:"));

                    
                    double bonus = Double.parseDouble(IO.readln("Enter bonus Salary:"));


                    String desig =  IO.readln("Employee new designation : ");

                    service.updateEmployee(id,salary,bonus,desig);

                }

                case 5->{
                	int id = Integer.parseInt(IO.readln("Employee Id : "));
                    service.deleteEmployee(id);
                }

                case 6->{
                    IO.println("Thank You");
                     System.exit(0);
                     }

                default-> IO.println("Invalid Choice");
            }
        }while(true);
    }
}