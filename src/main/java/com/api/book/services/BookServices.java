package com.api.book.services;

import com.api.book.entities.Book;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookServices {

	private static  List<Book> list=new ArrayList<>();
	
	static {
		
		list.add(new Book(12,"java complete ref","ABC"));
		list.add(new Book(1,"java complete ref","ABC"));
		list.add(new Book(10,"java complete ref","ABC"));
	}
	
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}
	
	
	//get single book by id
	public Book getBookById(int id)
	
	{
		Book book=null;
	  book=list.stream().filter(e->e.getId()==id).findFirst().get();
	  return book;
		
	}
}
