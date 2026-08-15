package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.services.IMovieService;

@Component
public class MovieRunner implements CommandLineRunner{
	@Autowired
	private IMovieService service;

	@Override
	public void run(String... args) throws Exception {
		IO.println("=========================Sort By Ascending order based on Movie Name====================");
		service.sortByName(true, "movieName").forEach(IO::println);
		IO.println("=========================Sort By Descending order based on Movie Name====================");
		service.sortByName(false, "movieName").forEach(IO::println);
		IO.println("=========================Sort By Ascending order based on Ticket price====================");
		service.sortByPrice(true, "ticketPrice").forEach(IO::println);
		IO.println("=========================Sort By Descending order based on Ticket price====================");
		service.sortByPrice(false,"ticketPrice").forEach(IO::println);
		
	}

}
