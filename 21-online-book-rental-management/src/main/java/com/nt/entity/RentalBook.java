package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RentalBook {
	
	@Id
	private Long bookId;
	private String bookTitle;
	private String authorName;
	private String category;
	private Double rentalPrice;
	
	
	public RentalBook() {
		super();
	}


	public RentalBook(Long bookId, String bookTitle, String authorName, String category, Double rentalPrice) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.category = category;
		this.rentalPrice = rentalPrice;
	}


	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getAuthorName() {
		return authorName;
	}


	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Double getRentalPrice() {
		return rentalPrice;
	}


	public void setRentalPrice(Double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}


	@Override
	public String toString() {
		return "RentalBook [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName
				+ ", category=" + category + ", rentalPrice=" + rentalPrice + "]";
	}
	
	
	

}
