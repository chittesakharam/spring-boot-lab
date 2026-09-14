package com.nt.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.exception.ParkingSlotNotFoundException;

@RestControllerAdvice
public class ParkingSlotErrorHandler {
	
	@ExceptionHandler(ParkingSlotNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleParkingSlotNotFound(ParkingSlotNotFoundException psk)
	{
		System.out.println("ParkingSlotErrorHandler.handleParkingSlotNotFound()");
		ErrorDetails error = new ErrorDetails(LocalDateTime.now(),psk.getMessage(),""+HttpStatus.NOT_FOUND);
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> genericException(Exception e)
	{
		System.out.println("ParkingSlotErrorHandler.genericException()");
		ErrorDetails error = new ErrorDetails(LocalDateTime.now(),e.getMessage(),"404-"+e.getMessage());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.NOT_FOUND);
	}

}
