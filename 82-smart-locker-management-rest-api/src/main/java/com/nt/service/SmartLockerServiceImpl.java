package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.SmartLocker;
import com.nt.exception.LockerNotFoundException;
import com.nt.repository.SmartLockerRepository;
import com.nt.vo.SmartLockerVO;

@Service
public class SmartLockerServiceImpl implements SmartLockerService {

	private final SmartLockerRepository repo;
	
	public SmartLockerServiceImpl(SmartLockerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String createLocker(SmartLockerVO locker) {
		 SmartLocker entity = new SmartLocker();
		 IO.println(entity.getLockerId());
		 BeanUtils.copyProperties(locker, entity);
		 Long id = repo.save(entity).getLockerId();
		
		return "Smart Locker Added with id "+id;
	}

	@Override
	public List<SmartLockerVO> viewAllLockers() {
		List<SmartLocker> all = repo.findAll();
		List<SmartLockerVO> list = all.stream().map(entity->{
			SmartLockerVO vo = new SmartLockerVO();
			BeanUtils.copyProperties(entity, vo);
			return vo;
		}).toList();
		
		return list;
	}

	@Override
	public SmartLockerVO getLockerById(Long id) {
		SmartLocker entity = findById( id);	
		SmartLockerVO locker = new SmartLockerVO();
		BeanUtils.copyProperties(entity, locker);
		
		return locker;
	}

	@Override
	public String updateLocker(Long id, SmartLockerVO updatedLocker) {
		SmartLocker entity = findById(id);
		BeanUtils.copyProperties(updatedLocker, entity);
		 repo.save(entity).getLockerId();
		return id+" SmartLocker Updated";
	}

	@Override
	public String updateSpecificFields(Long id, SmartLockerVO vo) {
		SmartLocker entity = findById( id);	
		 if(vo.getHourlyRate()!=null)
			 entity.setHourlyRate(vo.getHourlyRate());
		 if(vo.getIsAvailable()!=null)
			 entity.setIsAvailable(vo.getIsAvailable());
		 repo.save(entity);
		return id+" Hourly Rate and Status Are Updated";
	}

	@Override
	public String deleteLockerById(Long id) {
		SmartLocker entity = findById( id);
		repo.delete(entity);
		return id+" Smart Locker Deleted";
	}
	
@Override
	public String createMultileLocker(List<SmartLockerVO> list) {
		
	List<SmartLocker> lockers = list.stream().map(vo->{
		SmartLocker locker = new SmartLocker();
		BeanUtils.copyProperties(vo, locker);
		return locker;
	}).toList();
	
	 List<SmartLocker> saveAll = repo.saveAll(lockers);
	    List<Long> ids = saveAll.stream().map(SmartLocker::getLockerId).toList();
		return ids.size()+" Lockers are Created with id "+ids;
	}
	
	private SmartLocker findById(Long id)
	{
		SmartLocker entity = repo.findById(id).orElseThrow(()-> new LockerNotFoundException("Invalid Id"));
		return entity;
	}

}
