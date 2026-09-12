package com.nt.exception;

public class MovieReviewNotFoundException extends RuntimeException {

	public MovieReviewNotFoundException() {
		super();
	}
	public MovieReviewNotFoundException(String msg) {
		super(msg);
	}

	
}
