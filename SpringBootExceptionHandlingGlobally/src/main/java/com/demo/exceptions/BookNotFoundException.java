package com.demo.exceptions;

public class BookNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 2761025334915799539L;
	
	public BookNotFoundException(String msg) {
		
		super(msg);
	}
	
}
