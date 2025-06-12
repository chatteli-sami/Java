package com.allbooks.allbook.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.allbooks.allbook.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}

