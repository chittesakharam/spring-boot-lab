package com.nt.services;

import com.nt.entity.Movie;

public interface IMovieService {
	
	Iterable<Movie> sortByName(boolean order,String... props);
	Iterable<Movie> sortByPrice(boolean order,String... props);
	

}
