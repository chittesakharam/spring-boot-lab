package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IUserProfileMgmtService;

@Component
public class UserProfileRunner implements CommandLineRunner {

    @Autowired
    private IUserProfileMgmtService service;

    @Override
    public void run(String... args) throws Exception {

        while(true) {

            IO.println("");
            IO.println("========== USER PROFILE ==========");
            IO.println("1.Save User");
            IO.println("2.Get User");
            IO.println("3.view All");
            IO.println("4.Exit");
            IO.println("Choose Option : ");

            int choice = Integer.parseInt(IO.readln());

            switch(choice) {

                case 1 -> service.saveUser();

                case 2 -> {

                    IO.println("Enter User Id");

                    Integer id = Integer.parseInt(IO.readln());

                    service.showUser(id);
                }
                case 3-> service.showAll();

                case 4 -> {

                    IO.println("Application Closed");

                    System.exit(0);
                }

                default -> IO.println("Invalid Choice");
            }

        }
           }

}
