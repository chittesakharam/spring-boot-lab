package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Course;
import com.nt.entity.University;
import com.nt.service.IUniversityMgmtService;

@Component
public class OneToManyRunner implements CommandLineRunner {

	@Autowired
	private IUniversityMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		
		University u1 = new University("Global University","Hyderabad");
		Course c1 = new Course("Java Full Stack","6 Months",25000.0);
		Course c2 = new Course("Spring Boot","3 Months",15000.0);
		List<Course> list = Arrays.asList(c1,c2);
		u1.setCourses(list);
		String msg = service.addUniversityWithMultiple(u1);
	   IO.println("-------------------------------------");
	    
	     service.showAllUniversityWithCourses().forEach(u->{
	    	 IO.println("University Details ");
	    	 IO.println("----------------------------------");
	    	 IO.println("University Id : "+u.getUniversityId());
	    	 IO.println("City : "+u.getCity());
	    	 u.getCourses().forEach(c->{
	    		 IO.println("Course Detials ");
	    		 IO.println("-------------------------------");
	    		 IO.println("Course ID : "+c.getCourseId());
	    		 IO.println("Couse Name: "+c.getCourseName());
	    		 IO.println("Duration : "+c.getDuration());
	    		 IO.println("Fee : "+c.getFee());
	    	 });
	     }
	     );
	}

}
