package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.entity.Festival;
import com.nt.service.IFestivalArtistMgmtService;

@Component
public class ArtistAndFestivalTestRunner implements CommandLineRunner {
	@Autowired
 IFestivalArtistMgmtService service;

	
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1. Save a new Artist with multiple Festivals.\r\n"
				+ "2. Save a new Festival with multiple Artists.\r\n"
				+ "3. Find Artist by artistName.\r\n"
				+ "4. Find Festival by festivalName.\r\n"
				+ "5. Find all Artists performing in a particular Festival.\r\n"
				+ "6. Find all Festivals attended by a particular Artist.\r\n"
				+ "7. Update Festival ticketPrice.\r\n"
				+ "8. Update Artist experienceYears.\r\n"
				+ "9. Delete an Artist.\r\n"
				+ "10. Delete a Festival.\r\n"
				+ "11. Display all Artists.\r\n"
				+ "12. Display all Festivals.\n13. Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter your choice: "));
		switch(choice)
		{
		case 1-> {
			String name=IO.readln("Enter Artist name: ");
			String genre= IO.readln("Enter Genre: ");
			String country=IO.readln("Enter Country: ");
			int exp = Integer.parseInt(IO.readln("Enter Experience : "));
			int n = Integer.parseInt(IO.readln("Enter No of Festivals  : "));
			List<Festival> festivals = new ArrayList<>();
			Artist artist = new  Artist(name,genre,country,exp);
			for(int i=0;i<n;i++)
			{
				String fName= IO.readln("Enter Festival Name: ");
				String city=IO.readln("Enter City: ");
				String date=IO.readln("Enter Date: ");
				Double price = Double.parseDouble(IO.readln("Enter Ticket Price: "));
				festivals.add(new Festival(fName,city,date,price));
			}
			artist.setFestivals(festivals);
			String msg = service.saveArtistWithFestivals(artist);
			IO.println(msg);
			
		}
		case 2-> {
			String fName= IO.readln("Enter Festival Name: ");
			String city=IO.readln("Enter City: ");
			String date=IO.readln("Enter Date: ");
			Double price = Double.parseDouble(IO.readln("Enter Ticket Price: "));
			Festival festival = new Festival(fName,city,date,price);
			int n = Integer.parseInt(IO.readln("Enter No of Festivals  : "));
			List<Artist> artists = new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				String name=IO.readln("Enter Artist name: ");
				String genre= IO.readln("Enter Genre: ");
				String country=IO.readln("Enter Country: ");
				int exp = Integer.parseInt(IO.readln("Enter Experience : "));
				artists.add(new  Artist(name,genre,country,exp));	
			}
			festival.setArtists(artists);
			String msg = service.savefastivalWithArtists(festival);
			IO.println(msg);
		}
		case 3->{
			String name=IO.readln("Enter Artist name: ");
			Artist artist = service.viewArtistbyName(name);
			IO.println(artist);
		}
		case 4->{
			String fName= IO.readln("Enter Festival Name: ");
			Festival festival = service.findFestivalByName(fName);
			IO.println(festival);
		}
		
		case 5->service.viewAllArtistWithFestival(IO.readln("Enter Festival Name: ")).forEach(IO::println);
		
		case 6-> service.viewAllFestivalSpecipicArtist(IO.readln("Enter Artist name: ")).forEach(IO::println);
		case 7->{
			String fName= IO.readln("Enter Festival Name: ");
			Double price = Double.parseDouble(IO.readln("Enter Ticket Price: "));
			String msg = service.updateTicketPrice(fName, price);
			IO.println(msg);
		}
		case 8->{
			String name=IO.readln("Enter Artist name: ");
			int exp = Integer.parseInt(IO.readln("Enter Experience : "));
			String msg = service.updateArtistExp(name, exp);
			IO.println(msg);
		}
		case 9->{
			String name=IO.readln("Enter Artist name: ");
			String msg = service.deleteAnArtist(name);
			IO.println(msg);
		}
		case 10->{
			String fName= IO.readln("Enter Festival Name: ");
			IO.println(service.deleteAnFestival(fName));
		}
		case 11-> service.showAllArtists().forEach(IO::println);
		case 12->service.showAllFestivals().forEach(IO::println);
		case 13-> System.exit(0);
		}
	}
	}

}
