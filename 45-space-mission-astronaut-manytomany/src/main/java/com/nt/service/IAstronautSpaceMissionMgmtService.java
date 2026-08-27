package com.nt.service;

import java.util.List;

import com.nt.entity.Astronaut;
import com.nt.entity.SpaceMission;

public interface IAstronautSpaceMissionMgmtService {
	
	public String registerAstronautWithMissions(Astronaut astronat);
	
	String addSpaceMissionWithAstronauts(SpaceMission sm);
    Astronaut findAstronautByName(String name);
	SpaceMission findSpaceMissionByName(String name);
	
	List<SpaceMission> findAllMissionByAstronaut(String aName);
	List<Astronaut> findAllAstronautByMissionString (String mName);
	
	String updateMissionDestination(String name,String dest);
	String updateAstronautTotalFlights(String name,Integer flight);
	
	String deleteAstronaut(String name);
	String deleteSpaceMission(String name);
	
	List<Astronaut> viewAllAstronauts();
	List<SpaceMission> viewAllSpaceMissions();
	

}
