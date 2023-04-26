package com.graphQL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphQL.entities.Book;
import com.graphQL.services.implementations.BookService;

@SpringBootApplication
public class GraphQlApiApplication implements CommandLineRunner {
	@Autowired
	private BookService _bookService;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = Book.builder()
				.title("First Book")
				.desc("Written by vivek")
				.author("Vivek")
				.price(45.45)
				.pages(100)
				.build();
		Book b2 = Book.builder()
				.title("Second Book")
				.desc("Written by saurabh")
				.author("saurabh")
				.price(45.45)
				.pages(100)
				.build();

		Book b3 = Book.builder()
				.title("Third Book")
				.desc("Written by shivam")
				.author("shivam")
				.price(45.45)
				.pages(100)
				.build();

		this._bookService.create(b1);
		this._bookService.create(b2);
		this._bookService.create(b3);
	}

}
