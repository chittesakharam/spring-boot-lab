package com.nt.service;

import java.util.List;

import com.nt.entity.FootballPlayer;

public interface IFootballPlayerMgmtService {

	public FootballPlayer registerPlayer(FootballPlayer player);

	public List<FootballPlayer> fetchPlayersByClub(String club);

	public List<FootballPlayer> fetchPlayersBySalary(Double salary);

	public List<FootballPlayer> fetchPlayersByPositionAndCountry(String position,String country);

	public List<FootballPlayer> fetchPlayersByNamePrefix(String prefix);

	public List<FootballPlayer> fetchPlayersByJerseyRange(Integer start,Integer end);

	public Long getPlayersCountByCountry(String country);

	public List<FootballPlayer> fetchHighestPaidPlayers();

	public String updatePlayerSalary(Long playerId,Double salary);

	public String deletePlayersByClub(String club);

	public List<Object[]> showPlayerNameAndClub();
}