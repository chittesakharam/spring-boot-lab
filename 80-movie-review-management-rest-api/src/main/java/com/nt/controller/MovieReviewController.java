package com.nt.controller;

import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IMovieReviewService;
import com.nt.vo.MovieReviewVO;

@RestController
@RequestMapping("/reviews")
public class MovieReviewController {
	
	private final IMovieReviewService service;

	MovieReviewController(IMovieReviewService service) {
		this.service = service;
	}
	@PostMapping()
	public ResponseEntity<String> addMovieReview(@RequestBody MovieReviewVO review)
	{
		String review2 = service.addReview(review);
		return new ResponseEntity<String>(review2, HttpStatusCode.valueOf(200));
		
	}
	@GetMapping()
	public ResponseEntity<?> getAllMovieReview()
	{
		  List<MovieReviewVO> allReviews = service.getAllReviews();
		return new ResponseEntity<List<MovieReviewVO>>(allReviews, HttpStatusCode.valueOf(200));
		
	}
	 @GetMapping("/{id}")
	public ResponseEntity<MovieReviewVO> getMovieReviewById(@PathVariable Long id)
	{
		 MovieReviewVO review = service.gerReviewById(id);
		return new ResponseEntity<MovieReviewVO>(review, HttpStatusCode.valueOf(200));
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateMovieReview(@PathVariable Long id ,@RequestBody MovieReviewVO review)
	{
		 String updateReview = service.updateReview(id, review);
		return new ResponseEntity<String>(updateReview, HttpStatusCode.valueOf(200));
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMovieReviewById(@PathVariable Long id)
	{
		String delete = service.deleteReviewById(id);
		return new ResponseEntity<String>(delete, HttpStatusCode.valueOf(200));
		
	}

}
