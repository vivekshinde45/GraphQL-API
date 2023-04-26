package com.graphQL.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDto {

    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
