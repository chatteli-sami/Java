package com.allbooks.allbook.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.allbooks.allbook.models.Book;
import com.allbooks.allbook.repositories.BookRepository;

@Service
public class BookService {

    private BookRepository repo;

    public BookService(BookRepository repo) {
        this.repo = repo;
    }

    public List<Book> allBooks() {
        return repo.findAll();
    }

    public Book createBook(Book book) {
        return repo.save(book);
    }

    public Book findBook(Long id) {

        Optional<Book> book = repo.findById(id);
        if (book.isPresent()) {
            return book.get();
        } else {
            return null;
        }
    }

    public Book updateBook(Book book) {

        return repo.save(book);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}
