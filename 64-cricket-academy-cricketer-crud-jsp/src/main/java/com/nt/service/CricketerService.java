package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.Cricketer;
import com.nt.repository.ICricketerRepository;
import com.nt.vo.CricketerVO;

@Service
public class CricketerService implements ICricketerService {
   
	private final ICricketerRepository repo;

	CricketerService(ICricketerRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public String addCricketer(CricketerVO cricketer) {
		 Cricketer cr = new Cricketer();
		 BeanUtils.copyProperties(cricketer, cr);
		 repo.save(cr);
		return "Player Added in Academy with id :: "+cr.getPlayerId();
	}

	@Override
	public List<CricketerVO> viewAllCricketers() {
		
		  List<Cricketer> all = repo.findAll();
		  List<CricketerVO> list = all.stream().map(cr -> {
			  CricketerVO  vo = new CricketerVO();
			  BeanUtils.copyProperties(cr, vo);
			  return vo;
		  }).toList();
		return list;
	}

	@Override
	public CricketerVO findCricketerById(Integer id) {
		   Cricketer cricketer = repo.findById(id).get();
		   CricketerVO vo = new CricketerVO();
		   BeanUtils.copyProperties(cricketer, vo);
		   return vo;
	}

	@Override
	public String updateCricketer(CricketerVO cricketer) {
		
		Cricketer cr = repo.findById(cricketer.getPlayerId()).get();
		
		BeanUtils.copyProperties(cricketer, cr);
		repo.save(cr);
		
		return cr.getPlayerId()+" Cricketer Updated";
	}

	@Override
	public String deleteCricketer(Integer id) {
		  Optional<Cricketer> cricketer = repo.findById(id);
		  if(cricketer.isPresent())
		  {
			 repo.delete(cricketer.get());
			 return id+" Cricketer is Removed";
		  }
		return id+" Player not Found";
	}

}
