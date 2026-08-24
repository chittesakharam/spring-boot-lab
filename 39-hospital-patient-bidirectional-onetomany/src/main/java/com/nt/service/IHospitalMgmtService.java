package com.nt.service;

import java.util.List;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;

public interface IHospitalMgmtService {
	
	String addDoctorWithPatient(Doctor d);
	
	List<Doctor> showDoctorWithPatient();
	
	List<Patient> showPatientWithDoctor();
     
}
