package com.nt.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("diesel")
public class DieselEngine implements Engine {

	@Value("${power}")
	private int enginePower;
	@Value("${milege}")
	private double milege;
	@Value("${companyName}")
	private String companyName;
	
	@Override
	public void startEngine() {
		IO.println("Diesel Engine Started...");
	}

	@Override
	public void showEngineDetails() {
		IO.println("Engine Power: "+enginePower);
		IO.println("Milege: "+milege);
		IO.println("Company Name: "+companyName);
		
	}

}
