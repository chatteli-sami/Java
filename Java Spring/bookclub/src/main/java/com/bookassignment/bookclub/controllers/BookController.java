package com.bookassignment.bookclub.controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bookassignment.bookclub.models.Book;
import com.bookassignment.bookclub.models.LoginUser;
import com.bookassignment.bookclub.models.User;
import com.bookassignment.bookclub.services.BookService;
import com.bookassignment.bookclub.services.UserService;

@Controller
public class BookController {

    @Autowired
    private UserService users;

    @Autowired
    private BookService books;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser,
            BindingResult result, Model model, HttpSession session) {
        User user = users.register(newUser, result);

        if (result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }

    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
            BindingResult result, Model model, HttpSession session) {
        User user = users.login(newLogin, result);

        if (result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("userId", user.getId());
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session) {

        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }

        model.addAttribute("books", books.all());
        model.addAttribute("user", users.findById((Long) session.getAttribute("userId")));
        return "home.jsp";
    }

    @GetMapping("/addPage")
    public String addPage(@ModelAttribute("book") Book book, Model model, HttpSession session) {

        User user = users.findById((Long) session.getAttribute("userId"));
        model.addAttribute("user", user);

        return "addPage.jsp";
    }

    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {

        if (result.hasErrors()) {
            return "addPage.jsp";
        }

        books.create(book);

        return "redirect:/home";
    }

    @GetMapping("/books/{id}")
    public String showPage(Model model, @PathVariable("id") Long id, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            return "redirect:/";
        }
        Book book = books.findById(id);
        model.addAttribute("book", book);
        model.addAttribute("user", users.findById((Long) session.getAttribute("userId")));

        return "book.jsp";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
