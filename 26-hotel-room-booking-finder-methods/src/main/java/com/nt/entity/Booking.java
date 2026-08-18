package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
	private Long bookingId;
	@Column(length=30)
	private String guestName;
	@Column(length=30)
	private String roomType;
	@Column(length=30)
	private String city;
	private Double bookingAmount;
	private Integer numberOfDays;
	private LocalDate bookingDate;
	@Column(length=30)
	private String bookingStatus;
	public Booking(Long bookingId, String guestName, String roomType, String city, Double bookingAmount,
			Integer numberOfDays, LocalDate bookingDate, String bookingStatus) {
		super();
		this.bookingId = bookingId;
		this.guestName = guestName;
		this.roomType = roomType;
		this.city = city;
		this.bookingAmount = bookingAmount;
		this.numberOfDays = numberOfDays;
		this.bookingDate = bookingDate;
		this.bookingStatus = bookingStatus;
	}
	public Booking() {
		super();
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(Double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public Integer getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(Integer numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", guestName=" + guestName + ", roomType=" + roomType + ", city="
				+ city + ", bookingAmount=" + bookingAmount + ", numberOfDays=" + numberOfDays + ", bookingDate="
				+ bookingDate + ", bookingStatus=" + bookingStatus + "]";
	}
	
	
	
	
	
}
