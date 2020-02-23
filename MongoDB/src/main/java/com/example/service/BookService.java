package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DAO.BookDAO;
import com.example.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	public Collection<Book> getBooks() {
		return bookDAO.getBooks();
	}

	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookDAO.createBook(book);
	}
}
