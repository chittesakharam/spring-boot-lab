package com.nt.service;

import java.util.List;

import com.nt.vo.ReviewVO;

public interface ReviewService {

	String addReview(ReviewVO review);
	List<ReviewVO> viewAllReviews();
	ReviewVO getReviewById(Integer id);
	String updateReview(Integer id,ReviewVO review);
	String deleteReview(Integer id);
}
