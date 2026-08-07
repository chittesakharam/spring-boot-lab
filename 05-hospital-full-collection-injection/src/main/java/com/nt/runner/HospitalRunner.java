package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.beans.HospitalInfo;

@Component
public class HospitalRunner implements CommandLineRunner {

	@Autowired
	private HospitalInfo info;
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);

	}

}
