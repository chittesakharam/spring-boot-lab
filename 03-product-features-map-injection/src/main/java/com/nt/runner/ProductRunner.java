package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.beanclass.ProductInfo;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductInfo info;
	@Override
	public void run(String... args) throws Exception {
		IO.println(info);

	}

}
