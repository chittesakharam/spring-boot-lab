package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.Review;
import com.nt.exception.ReviewNotFoundException;
import com.nt.repository.ReviewRepository;
import com.nt.vo.ReviewVO;

@Service
public class ReviewServiceImpl implements ReviewService {

	private final ReviewRepository repo;
	
	public ReviewServiceImpl(ReviewRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addReview(ReviewVO review) {
		Review entity = new Review();
		BeanUtils.copyProperties(review, entity,"id");
		Integer id = repo.save(entity).getId();
		return "Review Added with Id:: "+id;
	}

	@Override
	public List<ReviewVO> viewAllReviews() {
		List<ReviewVO> list = repo.findAll().stream().map(entity->{
			ReviewVO vo = new ReviewVO();
			BeanUtils.copyProperties(entity, vo);
			return vo;
		}).toList();
		return list;
	}

	@Override
	public ReviewVO getReviewById(Integer id) {
		Review review = repo.findById(id).orElseThrow(()->new ReviewNotFoundException("Invalid id "));
		ReviewVO vo = new ReviewVO();
		BeanUtils.copyProperties(review, vo);
		return vo;
	}

	@Override
	public String updateReview(Integer id, ReviewVO review) {
		Review entity = repo.findById(id).orElseThrow(()->new ReviewNotFoundException("Invalid id "));
		BeanUtils.copyProperties(review, entity);
		repo.save(entity);
		return id+" Review Updated";
	}

	@Override
	public String deleteReview(Integer id) {
		Review review = repo.findById(id).orElseThrow(()->new ReviewNotFoundException("Invalid id "));
		repo.delete(review);
		return id+" Review Deleted";
	}

}
