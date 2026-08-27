package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Festival;

public interface IFestivalRepository extends JpaRepository<Festival, Integer> {
	
	 Festival findByFestivalName(String festivalName);

	    List<Festival> findByArtistsArtistName(String artistName);

		

	

}
