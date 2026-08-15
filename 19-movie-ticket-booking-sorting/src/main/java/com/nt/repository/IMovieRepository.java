package com.nt.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Movie;

public interface IMovieRepository extends PagingAndSortingRepository<Movie, Integer> {

}
