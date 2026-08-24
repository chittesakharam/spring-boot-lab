package com.nt.service;

import java.util.List;

import com.nt.entity.University;

public interface IUniversityMgmtService {
	
	String addUniversityWithMultiple(University u);
	
	List<University> showAllUniversityWithCourses();

}
