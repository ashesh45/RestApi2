package com.api.book.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entities.Book;
@RestController
public class BookController {
@Autowired
private BookService bookService;
    
@GetMapping("/books")
public List<Book> getBooks() {
	return this.bookService.getAllBooks();
}
}
