package com.nt.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nt.entity.Cricketer;
import com.nt.repository.ICricketerRepository;

@Component
public class CricketerService implements ICricketService {

	private ICricketerRepository repo;
	@Override
	public List<Cricketer> findByCountry(String country) {
		
		return repo.findByCountry(country);
	}

	@Override
	public List<Cricketer> findPlayersWithAverageGreaterThan(Double avg) {
		
		return repo.findPlyayersWithAverageGreaterThan(avg);
	}

	@Override
	public List<Cricketer> findAllBatsmen() {
		
		return repo.findAllBatsman();
	}

	@Override
	public List<Cricketer> findPlayersStartingWith(String prefix) {
		
		return repo.findPlayerStartWith(prefix);
	}

	@Override
	public List<Cricketer> findRetiredPlayers() {
		
		return repo.findRetiredPlayers();
	}

	@Override
	public List<Cricketer> findPlayersWithMoreCenturies(Integer count) {
		
		return repo.findPlayersWithMoreCenturies(count);
	}

	@Override
	public List<Cricketer> findPlayersByAgeRange(Integer minAge, Integer maxAge) {
		
		return repo.findPlayersByAgeRange(minAge, maxAge);
	}

	@Override
	public List<Cricketer> findByTeam(String team) {
		
		return repo.findByTeam(team);
	}

	@Override
	public Long countPlayersByCountry(String country) {
		
		return repo.countPlayersByCountry(country);
	}

	@Override
	public Cricketer findTopAveragePlayer() {
		
		return repo.findTopAveragePlayer();
	}

}
