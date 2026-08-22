
package com.nt.runner;

import java.io.FileInputStream;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.EmployeeResume;
import com.nt.service.IEmployeeMgmtService;

@Component
public class EmployeeResumeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1. Save Employee Resume\r\n2. View Employee Resume by Id\r\n3. View All Employee Resumes\r\n4. Delete Employee Resume\n5.Exit");
		
		int choice= Integer.parseInt(IO.readln("Enter your choice: "));
		switch(choice)
		{
		case 1->{
			Long id = Long.valueOf(IO.readln("Enter Employee Id"));
			String name=IO.readln("Enter Employee Name");
			String des = IO.readln("Enter Designation: ");
			String content=IO.readln("Enter Resume Content path");
			String employeeResume = service.addEmployeeResume(new EmployeeResume(id,name,des,content));
			IO.println(employeeResume);
		}
		case 2->{
			Long id = Long.valueOf(IO.readln("Enter Employee Id"));
			IO.println(service.showResumeById(id));
		}
		case 3-> service.showAllEmployee().forEach(IO::println);
		case 4-> IO.println(service.deleteResume());
		case 5->System.exit(0);
		
		}
		}
		
		
	}

}
