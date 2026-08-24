package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.entity.Patient;
import com.nt.repository.IDoctorRepository;
import com.nt.repository.IPatientRepository;

@Service
public class HospitalMgmtService implements IHospitalMgmtService {
	
	@Autowired
	private IDoctorRepository dRepo;
	@Autowired
	private IPatientRepository pRepo;

	@Override
	public String addDoctorWithPatient(Doctor d) {
		  Long id = dRepo.save(d).getDoctorId();
		return id+" with Doctor Registerd";
	}

	@Override
	public List<Doctor> showDoctorWithPatient() {
		
		return dRepo.findAll();
	}

	@Override
	public List<Patient> showPatientWithDoctor() {
		
		return pRepo.findAll();
	}

}
