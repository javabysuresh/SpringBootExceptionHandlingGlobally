package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Book;
import com.demo.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	@GetMapping(value="/getBook")
	public @ResponseBody Book getBookPriceById(@RequestParam("bookId")int bookId) {
		
		Book book= bookService.findBookPricebyId(bookId);
		return book;
	}
}
