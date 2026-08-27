package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Artist;

public interface IArtistRepository extends JpaRepository<Artist, Integer> {

	Artist findByArtistName(String artistName);

    List<Artist> findByFestivalsFestivalName(String festivalName);

	
	
}