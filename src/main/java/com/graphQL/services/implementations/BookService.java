package com.graphQL.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graphQL.entities.Book;
import com.graphQL.repositories.BookRepository;
import com.graphQL.services.interfaces.IBookService;

@Service
public class BookService implements IBookService {

    @Autowired
    private BookRepository _bookRepository;

    @Override
    public Book create(Book book) {
        return this._bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this._bookRepository.findAll();
    }

    @Override
    public Book getById(Integer bookId) {
        return this._bookRepository.findById(bookId).orElseThrow(
                () -> new RuntimeException("Book with book id not found"));
    }

}