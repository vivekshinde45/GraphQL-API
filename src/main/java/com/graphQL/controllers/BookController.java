package com.graphQL.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphQL.entities.Book;
import com.graphQL.payload.BookDto;
import com.graphQL.services.implementations.BookService;

@Controller
public class BookController {
    @Autowired
    private BookService _bookService;

    // create
    // @PostMapping("/book")
    @MutationMapping("createBook")
    public Book create(@Argument BookDto bookDto) {
        Book book = Book.builder()
                .title(bookDto.getTitle())
                .author(bookDto.getAuthor())
                .desc(bookDto.getDesc())
                .price(bookDto.getPrice())
                .pages(bookDto.getPages())
                .build();
        return this._bookService.create(book);
    }

    // get all
    @QueryMapping("allBooks")
    public List<Book> getAllQL() {
        return this._bookService.getAll();
    }

    // get by id
    // @GetMapping("/book/{bookId}")
    @QueryMapping("getBook")
    public Book getById(@Argument Integer bookId) {
        return this._bookService.getById(bookId);
    }
}
