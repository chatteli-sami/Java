package com.books.booksapi.services;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.books.booksapi.repositories.BookRepository;
import com.books.booksapi.models.Book;

@Service
public class BookService {

    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            Book book = optionalBook.get();
            book.setTitle(title);
            book.setDescription(desc);
            book.setLanguage(lang);
            book.setNumberOfPages(numOfPages);
            return bookRepository.save(book);
        } else {
            return null;
        }
    }
   
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

