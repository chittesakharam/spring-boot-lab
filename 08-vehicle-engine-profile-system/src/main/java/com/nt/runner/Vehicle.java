package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.nt.service.Engine;

@Service
public class Vehicle implements CommandLineRunner {

   @Autowired
	private Engine engine;
	
	@Override
	public void run(String... args) throws Exception {
		engine.startEngine();
		engine.showEngineDetails();

	}

}
