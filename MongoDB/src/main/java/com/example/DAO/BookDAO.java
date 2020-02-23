package com.example.DAO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Book;

@Component
public class BookDAO {
	@Autowired
	private BookRepository repository; 
	
	public Collection<Book> getBooks(){
		return repository.findAll();
	}

	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return repository.insert(book);
	}
}
