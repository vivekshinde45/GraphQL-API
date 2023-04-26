package com.graphQL.services.interfaces;

import java.util.List;

import com.graphQL.entities.Book;

public interface IBookService {
    // create
    Book create(Book book);

    // get all
    List<Book> getAll();

    // get by id
    Book getById(Integer bookId);
}
