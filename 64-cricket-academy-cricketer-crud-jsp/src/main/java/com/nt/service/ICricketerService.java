package com.nt.service;

import java.util.List;

import com.nt.vo.CricketerVO;

public interface ICricketerService {

	String addCricketer(CricketerVO cricketer);
	
	List<CricketerVO> viewAllCricketers();
	
	CricketerVO findCricketerById(Integer id);
	
	String updateCricketer(CricketerVO cricketer);
	
	String deleteCricketer(Integer id);
}
