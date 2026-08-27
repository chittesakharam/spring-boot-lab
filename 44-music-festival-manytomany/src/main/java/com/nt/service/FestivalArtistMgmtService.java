package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.entity.Artist;
import com.nt.entity.Festival;
import com.nt.repository.IArtistRepository;
import com.nt.repository.IFestivalRepository;

@Component
public class FestivalArtistMgmtService implements IFestivalArtistMgmtService {

	@Autowired
	private  IFestivalRepository fRepo;
	@Autowired
	private  IArtistRepository aRepo;

	
	@Override
	public String saveArtistWithFestivals(Artist artist) {
		Integer id = aRepo.save(artist).getArtistId();
		return id+" With Artist saved";
	}

	@Override
	public String savefastivalWithArtists(Festival festival) {
		
		Integer id = fRepo.save(festival).getFestivalId();
		return id+"  with Festival Saved";
	}

	@Override
	public Artist viewArtistbyName(String name) {
		
		return aRepo.findByArtistName(name);
	}

	@Override
	public Festival findFestivalByName(String name) {
		 
		return fRepo.findByFestivalName(name);
	}

	@Override
	public List<Artist> viewAllArtistWithFestival(String fName) {
		
		return aRepo.findByFestivalsFestivalName(fName);
	}

	@Override
	public List<Festival> viewAllFestivalSpecipicArtist(String aName) {
		
		return fRepo.findByArtistsArtistName(aName);
	}

	@Override
	public String updateTicketPrice(String name, double price) {
		Festival fes = fRepo.findByFestivalName(name);
		fes.setTicketprice(price);
		fRepo.save(fes);
		return name+ " Price Updated";
	}

	@Override
	public String updateArtistExp(String name, int exp) {
		Artist artist = aRepo.findByArtistName(name);
		artist.setExperienceYears(exp);
		aRepo.save(artist);
		return name+" Artist Expiriance Updated";
	}

	@Override
	public String deleteAnArtist(String name) {
		Artist artist = aRepo.findByArtistName(name);
		artist.setFestivals(null);
		aRepo.save(artist);
		aRepo.delete(artist);
		return name+ " Artist deleted";
	}

	@Override
	public String deleteAnFestival(String name) {
		Festival fes = fRepo.findByFestivalName(name);
		fes.setArtists(null);
		fRepo.save(fes);
		fRepo.delete(fes);
		return name+" Festival deleted ";
	}

	@Override
	public List<Artist> showAllArtists() {
		
		return aRepo.findAll();
	}

	@Override
	public List<Festival> showAllFestivals() {
		
		return fRepo.findAll();
	}

}
