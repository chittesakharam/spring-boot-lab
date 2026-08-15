package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPatientService;
@Component
public class PatientRunner implements CommandLineRunner {

	@Autowired
	private IPatientService service;
	@Override
	public void run(String... args) throws Exception {
		IO.println("1 View Page 1\r\n"
				+ "2 View Page 2\r\n"
				+ "3 View Page 3\r\n"
				+ "");
		int choice = Integer.parseInt(IO.readln("Enter Your choice.."));
		switch(choice)
		{
		case 1->{
			//int pageno = Integer.parseInt(IO.readln("Enter PageNO:"));		
			int pageSize = Integer.parseInt(IO.readln("Enter Page Size:"));		
		service.showTotalRecord(1, 5).forEach(IO::println);
		}
		case 2->{
			//int pageSize = Integer.parseInt(IO.readln("Enter Page Size:"));		
			service.showTotalRecord(2, 5).forEach(IO::println);
		}
		case 3->{
			//int pageSize = Integer.parseInt(IO.readln("Enter Page Size:"));		
			service.showTotalRecord(3, 5).forEach(IO::println);
		}
		}

	}

}
