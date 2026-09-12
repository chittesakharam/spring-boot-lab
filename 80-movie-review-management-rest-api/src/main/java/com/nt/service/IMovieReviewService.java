package com.nt.service;

import java.util.List;

import com.nt.vo.MovieReviewVO;

public interface IMovieReviewService {
	
	String addReview(MovieReviewVO review);
	List<MovieReviewVO> getAllReviews();
	MovieReviewVO gerReviewById(Long id);
	String updateReview(Long id,MovieReviewVO reviewUpdate);
	String deleteReviewById(Long id);
}
