package com.nt.service;

import java.util.List;

import com.nt.entity.Patient;

public interface IPatientService {
	
	List<Patient> showTotalRecord(int pageNumber, int pageSize);

}
