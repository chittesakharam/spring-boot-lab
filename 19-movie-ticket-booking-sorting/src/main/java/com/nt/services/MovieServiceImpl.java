package com.nt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepository;

@Component
public class MovieServiceImpl implements IMovieService {
	@Autowired
     private IMovieRepository repo;
	
	@Override
	public Iterable<Movie> sortByName(boolean order,String...name ) {
		Sort sorted=Sort.by(order ? Sort.Direction.ASC : Sort.Direction.DESC,name);
		Iterable<Movie> all = repo.findAll(sorted);
		return all;
	}

	@Override
	public Iterable<Movie> sortByPrice(boolean order,String... props) {
	  Sort sorted=Sort.by(order ? Sort.Direction.ASC : Sort.Direction.DESC,props);
	   Iterable<Movie> all = repo.findAll(sorted);
		return all;
	}

}
