package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.BloodDonor;
import com.nt.repository.BloodDonorRepository;
import com.nt.vo.BloodDonorVO;

@Service
public class BloodDonorServiceImpl implements BloodDonorService {

	private final BloodDonorRepository repo;

	BloodDonorServiceImpl(BloodDonorRepository repo) {
		this.repo = repo;
	}
	@Override
	public String registerDonor(BloodDonorVO donor) {
         BloodDonor entity = new BloodDonor();
         BeanUtils.copyProperties(donor, entity);
         Long id = repo.save(entity).getDonorId();
		return "Donor Registerd with id value: "+id;
	}

	@Override
	public List<BloodDonorVO> viewAllDonors() {
		List<BloodDonor> all = repo.findAll();
		List<BloodDonorVO> list = all.stream().map(entity->{
			BloodDonorVO vo = new BloodDonorVO();
			BeanUtils.copyProperties(entity, vo);
			return vo;
		}).toList();
		return list;
	}

	@Override
	public BloodDonorVO getDonorById(Long id) {
		   BloodDonor donor = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		   BloodDonorVO vo = new BloodDonorVO();
		   BeanUtils.copyProperties(donor, vo);
		   
		return vo;
	}

	@Override
	public String updateDonor(Long id, BloodDonorVO updatedDonor) {
		BloodDonor donor = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		BeanUtils.copyProperties(updatedDonor, donor);
		repo.save(donor);
		return id+" Donor updated";
	}

	@Override
	public String deleteDonor(Long id) {
		BloodDonor donor = repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		repo.delete(donor);
		return id+" Donor Deleted ";
	}

}
