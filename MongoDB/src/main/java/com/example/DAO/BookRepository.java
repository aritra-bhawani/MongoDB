package com.example.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.entity.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
