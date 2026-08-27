package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Astronaut;
import com.nt.entity.SpaceMission;
import com.nt.repository.IAstronautRepository;
import com.nt.repository.ISpaceMissionRepository;

@Component
public class AstronautSpaceMissionMgmtService implements IAstronautSpaceMissionMgmtService {

	@Autowired
	private IAstronautRepository aRepo;
	@Autowired
	private ISpaceMissionRepository sRepo;
	@Override
	public String registerAstronautWithMissions(Astronaut astronat) {
		
		Integer id = aRepo.save(astronat).getAstronautId();
		return id+" With Astronaut Saved with SpaceMission "+astronat.getSpaceMissions().size();
	}

	@Override
	public String addSpaceMissionWithAstronauts(SpaceMission sm) {
		 Integer id = sRepo.save(sm).getMissionId();
		return id+" With SpaceMission Saved Wtih Astronuts "+sm.getAstronauts().size();
	}

	@Override
	public Astronaut findAstronautByName(String name) {
		return aRepo.findByAstronautName(name);
		
	}

	@Override
	public SpaceMission findSpaceMissionByName(String name) {
		
		return sRepo.findByMissionName(name);
	}

	@Override
	public List<SpaceMission> findAllMissionByAstronaut(String aName) {
		
		return sRepo.findByAstronautsAstronautName(aName);
	}

	@Override
	public List<Astronaut> findAllAstronautByMissionString(String mName) {
		
		return aRepo.findBySpaceMissionsMissionName(mName);
	}

	@Override
	public String updateMissionDestination(String name, String dest) {
		  SpaceMission ms = sRepo.findByMissionName(name);
		  ms.setDestination(dest);
		  sRepo.save(ms);
		return ms.getMissionId()+ " Destination Updated";
	}

	@Override
	public String updateAstronautTotalFlights(String name, Integer flight) {
		 Astronaut astronaut = aRepo.findByAstronautName(name);
		 astronaut.setTotalFlights(flight);
		 aRepo.save(astronaut);
		return astronaut.getAstronautId()+" Astronaut Total flights Updated ";
	}

	@Override
	public String deleteAstronaut(String name) {
		Astronaut a = aRepo.findByAstronautName(name);
		aRepo.delete(a);
		return "Astronaut Deleted";
	}

	@Override
	public String deleteSpaceMission(String name) {
		SpaceMission m = sRepo.findByMissionName(name);
		sRepo.delete(m);
		return "Space Mission Deleted";
	}

	@Override
	public List<Astronaut> viewAllAstronauts() {
		
		return aRepo.findAll();
	}

	@Override
	public List<SpaceMission> viewAllSpaceMissions() {
		
		return sRepo.findAll();
	}

}
