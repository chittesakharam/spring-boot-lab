package com.nt.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.ReviewService;
import com.nt.vo.ReviewVO;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

	private final ReviewService service;
	
	public ReviewController(ReviewService service) {
		super();
		this.service = service;
	}

	@PostMapping
	public ResponseEntity<String> addReview(@RequestBody ReviewVO review)
	{
		String addMsg = service.addReview(review);
		return new ResponseEntity<String>(addMsg,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<ReviewVO>> viewAllReviews()
	{
		List<ReviewVO> viewAllReviews = service.viewAllReviews();
		return new ResponseEntity<List<ReviewVO>>(viewAllReviews,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ReviewVO> getReviewById(@PathVariable Integer id)
	{
		ReviewVO review = service.getReviewById(id);
		return new ResponseEntity<ReviewVO>(review,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateReview(@PathVariable Integer id,@RequestBody ReviewVO review)
	{
		String updateReview = service.updateReview(id, review);
		return new ResponseEntity<String>(updateReview,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable Integer id)
	{
		String deleteReview = service.deleteReview(id);
		return new ResponseEntity<String>(deleteReview,HttpStatus.OK);
	}
}
