package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {
	@Autowired
	private StudentInfo info;
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);

	}

}
