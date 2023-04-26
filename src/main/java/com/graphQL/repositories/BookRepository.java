package com.graphQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphQL.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
