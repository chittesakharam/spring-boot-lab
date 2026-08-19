package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.nt.entity.FootballPlayer;
import com.nt.repository.IFootballPlayerRepository;

import jakarta.transaction.Transactional;

@Service
public class FootballPlayerMgmtServiceImpl  implements IFootballPlayerMgmtService {

	@Autowired
	private IFootballPlayerRepository repo;

	@Override
	public FootballPlayer registerPlayer(FootballPlayer player) {

		return repo.save(player);
	}

	@Override
	public List<FootballPlayer> fetchPlayersByClub(String club) {

		return repo.findByClub(club);
	}

	@Override
	public List<FootballPlayer> fetchPlayersBySalary(Double salary) {

		return repo.findPlayersWithSalaryGreaterThan(salary);
	}

	@Override
	public List<FootballPlayer> fetchPlayersByPositionAndCountry(String position,String country) {

		return repo.findByPositionAndCountry(position, country);
	}

	@Override
	public List<FootballPlayer> fetchPlayersByNamePrefix(String prefix) {

		return repo.findByNameStartsWith(prefix);
	}

	@Override
	public List<FootballPlayer> fetchPlayersByJerseyRange(Integer start,Integer end) {

		return repo.findByJerseyNumberBetween(start, end);
	}

	@Override
	public Long getPlayersCountByCountry(String country) {

		return repo.countPlayersByCountry(country);
	}

	@Override
	public List<FootballPlayer> fetchHighestPaidPlayers() {

		return repo.findHighestPaidPlayers();
	}

	@Override
	@Transactional
	@Modifying
	public String updatePlayerSalary(Long playerId,Double salary) {

		int count = repo.updateSalary(playerId, salary);

		return count == 0
				? "Player Not Found"
				: "Salary Updated";
	}

	@Override
	public String deletePlayersByClub(
			String club) {

		int count = repo.deleteByClub(club);

		return count + " Players Deleted";
	}

	@Override
	public List<Object[]> showPlayerNameAndClub() {

		return repo.getPlayerNameAndClub();
	}
}