package com.nt.runner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Course;
import com.nt.entity.Student;
import com.nt.service.IStudentCourseMgmtService;

@Component
public class StudentCourseRunner implements CommandLineRunner {

    @Autowired
    private IStudentCourseMgmtService service;

    @Override
    public void run(String... args) throws Exception {

        while(true) {

            IO.println("\n========= Student Course Menu =========");
            IO.println("1. Save Students With Multiple Courses");
            IO.println("2. Save Course With Multiple Students");
            IO.println("3. Show Courses with Students");
            IO.println("4. Show Students with Courses");
            
            IO.println("5. Exit");

            IO.print("Enter Choice : ");

            int choice=Integer.parseInt(IO.readln());

            switch(choice) {

            case 1 ->
            {
            	String name = IO.readln("Enter Name");
            	String email = IO.readln("Enter Email");
            	int n = Integer.parseInt(IO.readln("Enter how many Courses : "));
            	Set<Course> set = new HashSet<>();
            	for(int i =0;i<n;i++)
            	{
            		String cname = IO.readln("Enter Name");
            		int duration= Integer.parseInt(IO.readln("Enter Duration : "));
            		set.add(new Course(cname,duration));
            	}
            	Student s = new Student(name,email);
            	s.setCourses(set);
            	service.saveStudentsWithMultipleCourses(s);
            }
              

            case 2 ->{
            	String cname = IO.readln("Enter Name");
        		int duration= Integer.parseInt(IO.readln("Enter Duration: "));
        		int n = Integer.parseInt(IO.readln("Enter How many Student: "));
            	Set<Student> set = new HashSet<>();
            	for(int i =0;i<n;i++)
            	{
            		String name = IO.readln("Enter Name");
                	String email = IO.readln("Enter Email");
                	set.add(new Student(name,email));
            	}
            	Course c = new Course(cname,duration);
            	c.setStudents(set);
            	service.saveCourseWithMultipleStudent(c);
            }

            case 3 ->service.showCoursesWithStudetns();
               
            case 4-> service.showStudentsWithCourses();

            case 5 ->{
                IO.println("Application Closed...");
                System.exit(0);
            }

            default ->
                IO.println("Invalid Choice");

            }

        }

    }

}