package com.nt.runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Astronaut;
import com.nt.entity.SpaceMission;
import com.nt.service.AstronautSpaceMissionMgmtService;

@Component
public class AstronautMissionRunner implements CommandLineRunner {

	@Autowired
	private AstronautSpaceMissionMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		while(true) {
		IO.println("1. Save an Astronaut with multiple Space Missions.\r\n"
				+ "2. Save a Space Mission with multiple Astronauts.\r\n"
				+ "3. Find Astronaut by astronautName.\r\n"
				+ "4. Find Mission by missionName.\r\n"
				+ "5. Find all Missions assigned to a specific Astronaut.\r\n"
				+ "6. Find all Astronauts participating in a specific Mission.\r\n"
				+ "7. Update Mission destination.\r\n"
				+ "8. Update Astronaut totalFlights.\r\n"
				+ "9. Delete an Astronaut.\r\n"
				+ "10. Delete a Space Mission.\r\n"
				+ "11. Display all Astronauts.\r\n"
				+ "12. Display all Space Missions\n13.Exit");
		
		int choice = Integer.parseInt(IO.readln("Enter Your choice: "));
		switch(choice)
		{
		case 1->{
			 String aName = IO.readln("Astronaut Name: ");
			 String specialization = IO.readln(" Sprciiztion: ");
			 String nationality = IO.readln(" Natinality : ");
			 Integer flight = Integer.parseInt(IO.readln("Enter Flight : "));
			 int n = Integer.parseInt(IO.readln("Enter Number of SpaceMission store: "));
			 List<SpaceMission> list = new ArrayList<>();
			 for(int i=0;i<n;i++)
			 {
				 String mName = IO.readln("Enter Mission Name: ");
				 int year = Integer.parseInt(IO.readln("Enter Year : "));
				 String destination = IO.readln("Enter destination : ");
				 String missionDuration = IO.readln("Enter missionDuration : ");
				 list.add(new SpaceMission(mName,year,destination,missionDuration));
				 
			 }
			 Astronaut astronaut = new Astronaut(aName,specialization,nationality,flight);
			 astronaut.setSpaceMissions(list);
		
			 String msg = service.registerAstronautWithMissions(astronaut);
			 IO.println(msg);
		}
		
		case 2->{
			 String mName = IO.readln("Enter Mission Name: ");
			 int year = Integer.parseInt(IO.readln("Enter Year : "));
			 String destination = IO.readln("Enter destination : ");
			 String missionDuration = IO.readln("Enter missionDuration : ");
			 int n = Integer.parseInt(IO.readln("Enter Number of SpaceMission store: "));
			 List<Astronaut> list = new ArrayList<>();
			 for(int i=0;i<n;i++)
			 {
				 String aName = IO.readln("Astronaut Name: ");
				 String specialization = IO.readln(" Specialization: ");
				 String nationality = IO.readln(" Natinality: ");
				 Integer flight = Integer.parseInt(IO.readln("Enter Flight : "));
				 list.add(new Astronaut(aName,specialization,nationality,flight));
			 }
			 SpaceMission sm = new SpaceMission(mName,year,destination,missionDuration);
			 sm.setAstronauts(list);
			 String msg = service.addSpaceMissionWithAstronauts(sm);
			 IO.println(msg);
			 }
		
		case 3->{
			 String aName = IO.readln("Astronaut Name: ");
			 Astronaut a = service.findAstronautByName(aName);
			 IO.println(a);
		}
		case 4->{
			String mName = IO.readln("Enter Mission Name: ");
			SpaceMission m = service.findSpaceMissionByName(mName);
			IO.println(m);
		}
		case 5->{
			String aName = IO.readln("Astronaut Name: ");
			List<SpaceMission> sm = service.findAllMissionByAstronaut(aName);
			sm.forEach(IO::println);
		}
		case 6->{
			String mName = IO.readln("Enter Mission Name: ");
			List<Astronaut> a = service.findAllAstronautByMissionString(mName);
			a.forEach(IO::println);
		}
		case 7->{
			String mName = IO.readln("Enter Mission Name: ");
			 String destination = IO.readln("Enter destination : ");
			 String msg = service.updateMissionDestination(mName, destination);
			 IO.println(msg);
		}
		case 8->{
			 String aName = IO.readln("Astronaut Name: ");
			 Integer flight = Integer.parseInt(IO.readln("Enter Flight : "));
			 String msg = service.updateAstronautTotalFlights(aName, flight);
			 IO.println(msg);
		}
		case 9->{
			String aName = IO.readln("Astronaut Name: ");
			IO.println( service.deleteAstronaut(aName));
		}
		case 10->{
			String mName = IO.readln("Enter Mission Name: ");
			IO.println(service.deleteSpaceMission(mName));
		}
		case 11-> service.viewAllAstronauts().forEach(IO::println);
		case 12->service.viewAllSpaceMissions().forEach(IO::println);
		case 13-> System.exit(0);
		}

	}
	}

}
