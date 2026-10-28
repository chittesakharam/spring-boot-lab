package com.nt.exception;

public class ReviewNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReviewNotFoundException() {
		super();
	}

	public ReviewNotFoundException(String msg) {
		super(msg);
	}

	
}
