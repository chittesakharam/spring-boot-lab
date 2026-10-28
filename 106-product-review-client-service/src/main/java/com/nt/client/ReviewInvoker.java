package com.nt.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.Review;

@FeignClient("review-service")
public interface ReviewInvoker {

	@PostMapping("/reviews")
	public ResponseEntity<String> addReview(@RequestBody Review review);
	
	@GetMapping("/reviews")
	public ResponseEntity<List<Review>> viewAllReviews();
	
	@GetMapping("/reviews/{id}")
	public ResponseEntity<Review> getReviewById(@PathVariable Integer id);
	
	@PutMapping("/reviews/{id}")
	public ResponseEntity<String> updateReview(@PathVariable Integer id,@RequestBody Review review);
	
	@DeleteMapping("/reviews/{id}")
	public ResponseEntity<String> deleteReview(@PathVariable Integer id);
}
