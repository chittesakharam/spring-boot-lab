package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Astronaut;

public interface IAstronautRepository extends JpaRepository<Astronaut, Integer> {
	
	public Astronaut findByAstronautName(String name);
	public List<Astronaut> findBySpaceMissionsMissionName(String sName);

}
