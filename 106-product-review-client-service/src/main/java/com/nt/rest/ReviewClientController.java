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

import com.nt.client.ReviewInvoker;
import com.nt.model.Review;

@RestController
@RequestMapping("/client/reviews")
public class ReviewClientController {
	
	private final ReviewInvoker service;

	public ReviewClientController(ReviewInvoker service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<String> addReview(@RequestBody Review review)
	{
		String addMsg = service.addReview(review).getBody();
		return new ResponseEntity<String>(addMsg,HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Review>> viewAllReviews()
	{
		List<Review> viewAllReviews = service.viewAllReviews().getBody();
		return new ResponseEntity<List<Review>>(viewAllReviews,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Review> getReviewById(@PathVariable Integer id)
	{
		Review review = service.getReviewById(id).getBody();
		return new ResponseEntity<Review>(review,HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateReview(@PathVariable Integer id,@RequestBody Review review)
	{
		String updateReview = service.updateReview(id, review).getBody();
		return new ResponseEntity<String>(updateReview,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable Integer id)
	{
		String deleteReview = service.deleteReview(id).getBody();
		return new ResponseEntity<String>(deleteReview,HttpStatus.OK);
	}
}
	


