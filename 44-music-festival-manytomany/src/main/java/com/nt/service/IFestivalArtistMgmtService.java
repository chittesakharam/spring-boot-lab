package com.nt.service;

import java.util.List;

import com.nt.entity.Artist;
import com.nt.entity.Festival;

public interface IFestivalArtistMgmtService {
	
	String saveArtistWithFestivals(Artist artist);
	String savefastivalWithArtists(Festival festival);
	Artist viewArtistbyName(String name);
	Festival findFestivalByName(String name);
	
	List<Artist> viewAllArtistWithFestival(String fName);
	List<Festival> viewAllFestivalSpecipicArtist(String aName);
	
	String updateTicketPrice(String name ,double price);
	String updateArtistExp(String name,int exp);
	String deleteAnArtist(String name);
	String deleteAnFestival(String name);
	
	List<Artist> showAllArtists();
	List<Festival> showAllFestivals();
	
}
