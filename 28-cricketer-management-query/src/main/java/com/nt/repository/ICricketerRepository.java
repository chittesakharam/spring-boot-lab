package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Cricketer;

public interface ICricketerRepository extends JpaRepository<Cricketer, Long> {
	
    @Query("SELECT c FROM Cricketer c WHERE c.country=?1")
    List<Cricketer> findByCountry(String country);

    @Query("SELECT c FROM Cricketer c WHERE c.battingAverage>?1")
    List<Cricketer> findPlyayersWithAverageGreaterThan(Double avg);

    @Query("SELECT c FROM Cricketer c WHERE c.role='Batsman'")
    List<Cricketer> findAllBatsman();

    @Query("SELECT c FROM Cricketer c WHERE c.playerName LIKE CONCAT(?1,'%')")
    List<Cricketer> findPlayerStartWith(String start);

    @Query("SELECT c FROM Cricketer c WHERE c.retired=true")
    List<Cricketer> findRetiredPlayers();

    @Query("SELECT c FROM Cricketer c WHERE c.centuries>?1")
    List<Cricketer> findPlayersWithMoreCenturies(Integer count);

    @Query("SELECT c FROM Cricketer c WHERE c.age BETWEEN ?1 AND ?2")
    List<Cricketer> findPlayersByAgeRange(Integer minAge, Integer maxAge);

    @Query("SELECT c FROM Cricketer c WHERE c.team=?1")
    List<Cricketer> findByTeam(String team);

    @Query("SELECT COUNT(c) FROM Cricketer c WHERE c.country=?1")
    Long countPlayersByCountry(String country);

    @Query("SELECT c FROM Cricketer c WHERE c.battingAverage=(SELECT MAX(x.battingAverage) FROM Cricketer x)")
    Cricketer findTopAveragePlayer();
}
