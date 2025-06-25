package com.bookassignment.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookassignment.bookclub.models.Book;
import com.bookassignment.bookclub.repositories.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository repo;

    public Book findById(Long id){
        Optional<Book> result = repo.findById(id);
        if(result.isPresent()){
            return result.get();
        }
        return null;
    }

    public Book create(Book book){
        return repo.save(book);
    }

    public List<Book> all(){
        return repo.findAll();
    }
}
