package com.bookassignment.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookassignment.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
