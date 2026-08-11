package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.StudentController;
import com.nt.entity.Student;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	private StudentController std;
	
	@Override
	public void run(String... args) throws Exception {
		
		while(true) {
		IO.println("1. Register Student    \n2. View All Students    \n3. Search By ID\r\n"
				+ "4. Update Course    \n5. Delete Student    \n6. Count Students\r\n"
				+ "7. Exit");
		
		 int choice = Integer.parseInt(IO.readln("Enter Your Choice: "));
		 switch(choice)
		 {
		 case 1-> {
			   //int id= Integer.parseInt(IO.readln("Enter Id: "));
			   String name=IO.readln("Enter Name: ");
			   String cname=IO.readln("Enter Course  Name: ");
			   double fee = Double.parseDouble(IO.readln("Enter Fee: "));
			   String iname=IO.readln("Enter Institute  Name: ");
			   Student s = new Student(name,cname,fee,iname);
			   std.registerStudent(s);
		 }
		 case 2->std.getAllStudents();
		 case 3->{
			int id= Integer.parseInt(IO.readln("Enter Id: "));
			std.getStudentById(id);
		 }
		 case 4-> {
			int id= Integer.parseInt(IO.readln("Enter Id: "));
			 String cname=IO.readln("Enter Course  Name: ");
			 std.updateCourse(id, cname);
		 }
		 case 5-> {
			 int id= Integer.parseInt(IO.readln("Enter Id: "));
			 std.deleteStudent(id);	 
		 }
		 case 6-> std.countStudents();
		 case 7 -> System.exit(0);
		 }
		}
	}

}
