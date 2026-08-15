package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nt.entity.Patient;
import com.nt.repository.IPatientRepository;

@Service
public class PatientServiceImpl implements IPatientService {
	@Autowired
	private IPatientRepository repo;



	@Override
	public List<Patient> showTotalRecord(int pageNumber, int pageSize) {
		PageRequest pageRequest =PageRequest.of(pageNumber-1, pageSize);
		Page<Patient> all = repo.findAll(pageRequest);
		return all.getContent();
	}

}
