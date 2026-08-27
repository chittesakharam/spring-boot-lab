package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.SpaceMission;

public interface ISpaceMissionRepository extends JpaRepository<SpaceMission, Integer> {
	
	public SpaceMission findByMissionName(String name);
	public List<SpaceMission> findByAstronautsAstronautName(String aName);

}
