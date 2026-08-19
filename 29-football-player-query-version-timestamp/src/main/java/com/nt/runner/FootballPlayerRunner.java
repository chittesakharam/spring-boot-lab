package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.FootballPlayer;
import com.nt.service.IFootballPlayerMgmtService;

@Component
public class FootballPlayerRunner implements CommandLineRunner {

    @Autowired
    private IFootballPlayerMgmtService service;

    @Override
    public void run(String... args) throws Exception {

        while (true) {
            IO.println("\n========== MENU ==========");
            IO.println("1. Register Player");
            IO.println("2. Find By Club");
            IO.println("3. Find By Salary");
            IO.println("4. Find By Position & Country");
            IO.println("5. Find By Name Prefix");
            IO.println("6. Find By Jersey Range");
            IO.println("7. Count By Country");
            IO.println("8. Highest Paid Players");
            IO.println("9. Update Salary");
            IO.println("10. Delete By Club");
            IO.println("11. Player Name And Club");
            IO.println("0. Exit");

            int choice = Integer.parseInt(IO.readln("Enter Choice : "));

            switch (choice) {
                case 1 -> {
                    FootballPlayer player = new FootballPlayer();
                    player.setPlayerName(IO.readln("Player Name : "));
                    player.setCountry(IO.readln("Country : "));
                    player.setClub(IO.readln("Club : "));
                    player.setPosition(IO.readln("Position : "));
                    player.setSalary(Double.parseDouble(IO.readln("Salary : ")));
                    player.setJerseyNumber(Integer.parseInt(IO.readln("Jersey No : ")));

                    FootballPlayer p = service.registerPlayer(player);
                    IO.println("Player Registered With ID : " + p.getPlayerId());
                }
                case 2 -> service.fetchPlayersByClub(IO.readln("Club : ")).forEach(IO::println);
                case 3 -> service.fetchPlayersBySalary(Double.parseDouble(IO.readln("Salary : "))).forEach(IO::println);
                case 4 -> {
                    String pos = IO.readln("Position : ");
                    String country = IO.readln("Country : ");
                    service.fetchPlayersByPositionAndCountry(pos, country).forEach(IO::println);
                }
                case 5 -> service.fetchPlayersByNamePrefix(IO.readln("Prefix : ")).forEach(IO::println);
                case 6 -> {
                    Integer start = Integer.parseInt(IO.readln("Start Jersey : "));
                    Integer end = Integer.parseInt(IO.readln("End Jersey : "));
                    service.fetchPlayersByJerseyRange(start, end).forEach(IO::println);
                }
                case 7 -> {
                    Long count = service.getPlayersCountByCountry(IO.readln("Country : "));
                    IO.println("Players Count : " + count);
                }
                case 8 -> service.fetchHighestPaidPlayers().forEach(IO::println);
                case 9 -> {
                    Integer id = Integer.parseInt(IO.readln("Player Id : "));
                    Double salary = Double.parseDouble(IO.readln("New Salary : "));
                    IO.println(service.updatePlayerSalary((long)id, salary));
                }
                case 10 -> IO.println(service.deletePlayersByClub(IO.readln("Club : ")));
                case 11 -> {
                    List<Object[]> list = service.showPlayerNameAndClub();
                    list.forEach(obj -> IO.println("Player : " + obj[0] + " Club : " + obj[1]));
                }
                case 0 -> {
                    IO.println("Application Closed");
                    System.exit(0);
                }
                default -> IO.println("Invalid Choice");
            }
        }
    }
}