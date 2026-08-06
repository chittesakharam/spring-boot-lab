package com.nt.runnerclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.beanclasses.EmployeeInfo;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeInfo info;
	
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);
	}

}
