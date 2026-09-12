package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.entity.MovieReview;
import com.nt.exception.MovieReviewNotFoundException;
import com.nt.repository.IMovieReviewRepository;
import com.nt.vo.MovieReviewVO;

@Service
public class MovieReviewServiceImpl implements IMovieReviewService {

	private final IMovieReviewRepository repo;
	
	public MovieReviewServiceImpl(IMovieReviewRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public String addReview(MovieReviewVO review) {
		MovieReview movie = new MovieReview();
		BeanUtils.copyProperties(review, movie);
		Long id = repo.save(movie).getReviewId();
		
		return "Movie Review Added with id "+id;
	}

	@Override
	public List<MovieReviewVO> getAllReviews() {
		
		List<MovieReview> all = repo.findAll();
		List<MovieReviewVO> list = all.stream().map(entity->{
			MovieReviewVO vo = new MovieReviewVO();
			BeanUtils.copyProperties(entity, vo);
			return vo;
		}).toList();
		return list;
	}

	@Override
	public MovieReviewVO gerReviewById(Long id) {
		 MovieReview review = repo.findById(id).orElseThrow(()-> new MovieReviewNotFoundException("Invalid Id: "));
		 MovieReviewVO vo = new MovieReviewVO();
		 BeanUtils.copyProperties(review, vo);
		 return vo;
	}

	@Override
	public String updateReview(Long id, MovieReviewVO reviewUpdate) {
		 MovieReview entity = repo.findById(id).orElseThrow(()->new MovieReviewNotFoundException("Invalid Id: "));
		  BeanUtils.copyProperties(reviewUpdate, entity);
		  repo.save(entity);
		return id+" Moview Review Updated.";
	}

	@Override
	public String deleteReviewById(Long id) {
		 MovieReview entity = repo.findById(id).orElseThrow(()->new MovieReviewNotFoundException("Invalid Id: "));
		 repo.delete(entity);
		return id+"  Moview Review deleted.";
	}

}
