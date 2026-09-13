package com.nt.service;

import java.util.List;

import com.nt.vo.SmartLockerVO;

public interface SmartLockerService {
	
	String createLocker(SmartLockerVO locker);
	List<SmartLockerVO> viewAllLockers();
	SmartLockerVO getLockerById(Long id);
	String updateLocker(Long id,SmartLockerVO updatedLocker);
	String updateSpecificFields(Long id,SmartLockerVO vo);
	String deleteLockerById(Long id);
	
	String createMultileLocker(List<SmartLockerVO> lsit);

}
