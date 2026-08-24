package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.University;
import com.nt.repository.IUniversityRepository;
@Service
public class UniversityMgmtService implements IUniversityMgmtService {

	@Autowired
	private IUniversityRepository repo;
	@Override
	public String addUniversityWithMultiple(University u) {
		Long id = repo.save(u).getUniversityId();
		
		return id+" university Save  ";
	}
	@Override
	public List<University> showAllUniversityWithCourses() {
		
		return repo.findAll();
	}
	
	

}
