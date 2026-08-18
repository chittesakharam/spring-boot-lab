package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Course;
import com.nt.services.ICourseService;
@Component
public class CourseRunner implements CommandLineRunner {
	@Autowired
      private ICourseService service;
	@Override
	public void run(String... args) throws Exception {
		
		do {
	    IO.println("1: Display all courses in the Java category.");
	    IO.println("2: Display all courses taught by Rahul Sharma.");
	    IO.println("3: Display all courses with price less than 2000.");
	    IO.println("4: Display all courses with price greater than 5000.");
	    IO.println("5: Display all courses having duration greater than 40 hours.");
	    IO.println("6: Display all courses having rating greater than or equal to 4.5.");
	    IO.println("7: Display all courses available in English language.");
	    IO.println("8: Display all courses whose title contains \"Spring\".");
	    IO.println("9: Exit Application");
	    
	    int choice = Integer.parseInt(IO.readln("Enter your choice: "));
	    switch(choice)
	    {
	    case 1->  service.findByCategory("java").forEach(IO::println);
	    case 2-> {
	    	  service.findByInstructorName("Rahul Sharma").forEach(IO::println);
	        
	    }
	    case 3-> service.findByPriceLessThan(2000.0).forEach(c->IO.println(c.getCourseTitle()+" - "+c.getPrice()));
	    case 4-> service.findByPriceGreaterThan(5000.0).forEach(c->IO.println(c.getCourseTitle()+" - "+c.getPrice()));
	    case 5-> service.findByDuration(40).forEach(c->IO.println(c.getCourseTitle()+" - "+c.getDurationINHours()));
	    case 6-> service.findByRatingGreaterThanEqual(4.5).forEach(c->IO.println(c.getCourseTitle()+" - "+c.getRating()));
	    case 7-> service.findByLanguage("English").forEach(c->IO.println(c.getCourseTitle()));
	    case 8 ->service.findByCourseTitleContaining("Spring").forEach(c->IO.println(c.getCourseTitle()));
	    case 9-> {
	    	IO.println("Thank You ");
	    	System.exit(0);
	    }
	    }
		}while(true);
		
	}

}
