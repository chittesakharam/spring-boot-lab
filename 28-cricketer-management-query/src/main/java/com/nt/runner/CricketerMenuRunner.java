package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.ICricketService;

@Component
public class CricketerMenuRunner implements CommandLineRunner {

    @Autowired
    private ICricketService service;

    @Override
    public void run(String... args) throws Exception {

        while(true) {

            IO.println("\n===== CRICKETER MANAGEMENT SYSTEM =====");
            IO.println("1. Find Players By Country");
            IO.println("2. Find Players With Average Greater Than");
            IO.println("3. Find All Batsmen");
            IO.println("4. Find Players Starting With");
            IO.println("5. Find Retired Players");
            IO.println("6. Find Players With More Centuries");
            IO.println("7. Find Players By Age Range");
            IO.println("8. Find Players By Team");
            IO.println("9. Count Players By Country");
            IO.println("10. Find Top Average Player");
            IO.println("0. Exit");

            int choice = Integer.parseInt(IO.readln("Enter Your Choice : "));

            switch(choice) {

                case 1 -> service.findByCountry(IO.readln("Enter Country : "))
                                 .forEach(IO::println);

                case 2 -> service.findPlayersWithAverageGreaterThan(Double.parseDouble(IO.readln("Enter Batting Average : ")))
                                 .forEach(IO::println);

                case 3 -> service.findAllBatsmen()
                                 .forEach(IO::println);

                case 4 -> service.findPlayersStartingWith(IO.readln("Enter Name Prefix : "))
                                 .forEach(IO::println);

                case 5 -> service.findRetiredPlayers()
                                 .forEach(IO::println);

                case 6 -> service.findPlayersWithMoreCenturies(Integer.parseInt(IO.readln("Enter Century Count : ")))
                                 .forEach(IO::println);

                case 7 -> service.findPlayersByAgeRange(
                                        Integer.parseInt(IO.readln("Enter Minimum Age : ")),
                                        Integer.parseInt(IO.readln("Enter Maximum Age : ")))
                                 .forEach(IO::println);

                case 8 -> service.findByTeam(IO.readln("Enter Team Name : "))
                                 .forEach(IO::println);

                case 9 -> IO.println("Total Players : " +
                                 service.countPlayersByCountry(IO.readln("Enter Country : ")));

                case 10 -> IO.println(service.findTopAveragePlayer());

                case 0 -> {
                    IO.println("Thank You...");
                    System.exit(0);
                }

                default -> IO.println("Invalid Choice!");
            }
        }
    }
}