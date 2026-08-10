package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.nt.service.StudentDatabaseService;

@Service
public class DatabaseRunner implements CommandLineRunner {

	@Autowired
	private StudentDatabaseService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.connectDatabase();
		service.displayDatabaseInfo();
	}

}
