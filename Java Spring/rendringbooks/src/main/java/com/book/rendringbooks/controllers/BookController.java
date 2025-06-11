package com.book.rendringbooks.controllers;

import com.book.rendringbooks.models.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    public Book getBookById(Long id) {
        return new Book(id, "Example Book Title", "Author Name", "A detailed description of the book.");
    }

    @GetMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = getBookById(id);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
