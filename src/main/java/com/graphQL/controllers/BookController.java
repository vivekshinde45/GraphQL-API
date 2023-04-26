package com.graphQL.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphQL.entities.Book;
import com.graphQL.services.implementations.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookService _bookService;

    // create
    @PostMapping("/book")
    public ResponseEntity<Book> create(@RequestBody Book book) {
        Book savedBook = this._bookService.create(book);
        return ResponseEntity.ok(savedBook);
    }

    // get all
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAll() {
        List<Book> books = this._bookService.getAll();
        return ResponseEntity.ok(books);
    }

    // get by id
    @GetMapping("/book/{bookId}")
    public ResponseEntity<Book> getById(@PathVariable Integer bookId) {
        Book book = this._bookService.getById(bookId);
        return ResponseEntity.ok(book);
    }
}
