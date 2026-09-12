package com.nt.service;

import java.util.List;

import com.nt.vo.BloodDonorVO;

public interface BloodDonorService {
	
	String registerDonor(BloodDonorVO donor);
	List<BloodDonorVO> viewAllDonors();
	BloodDonorVO getDonorById(Long id);
	String updateDonor(Long id,BloodDonorVO updatedDonor);
	String deleteDonor(Long id);
	

}
