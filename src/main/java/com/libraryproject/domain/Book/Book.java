package com.libraryproject.domain.Book;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class Book {
        private int id;
        private String bookName;
        private String authorBook;
        private boolean available;
    }
