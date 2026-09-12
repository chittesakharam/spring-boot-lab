package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.MovieReview;

public interface IMovieReviewRepository extends JpaRepository<MovieReview, Long> {

}
