package com.demo.service;

import org.springframework.stereotype.Service;

import com.demo.exceptions.BookNotFoundException;
import com.demo.pojo.Book;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public Book findBookPricebyId(int bookId) {
		if(bookId==1)
			return new Book(1, "Java", 500, "CharlessBabege");
		else
			throw new BookNotFoundException("Book is Not Avilable");
	}
	
}
