package com.nt.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.service.IHospitalMgmtService;

@Component
public class HospitalRunner implements CommandLineRunner {

	@Autowired
	private IHospitalMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		
		Doctor d = new Doctor("Dr. Sharma ","Cardiologist");
		Patient p1 = new Patient("Raj","Heart Problem",35);
		Patient p2 = new Patient("Priya","Boold prissure",24);
		d.setPatients(Arrays.asList(p1,p2));
		
		service.addDoctorWithPatient(d);
		
		service.showDoctorWithPatient().forEach(doc ->
		{
			IO.println(doc);
			//doc.getPatients().forEach(c->IO.println(c));
		});

	}

}
