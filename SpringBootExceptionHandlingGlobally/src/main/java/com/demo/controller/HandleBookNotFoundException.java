package com.demo.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demo.exceptions.ApiError;
import com.demo.exceptions.BookNotFoundException;

@Controller
@ControllerAdvice
public class HandleBookNotFoundException {
	
	@ExceptionHandler(value=BookNotFoundException.class)
	public ResponseEntity<ApiError> handleBookNotFoundException() {
		ApiError error=new ApiError(400, "Book Is Not Availabale", new Date());
		return new ResponseEntity<ApiError>(error,HttpStatus.BAD_REQUEST);
		
	}
}
