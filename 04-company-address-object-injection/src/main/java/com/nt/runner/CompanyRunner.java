package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.beans.CompanyInfo;

@Component
public class CompanyRunner implements CommandLineRunner {

	@Autowired
	private CompanyInfo info;
	@Override
	public void run(String... args) throws Exception {
		IO.print(info);
	}

}
