package com.libraryproject.domain;

import lombok.Builder;
import lombok.Value;


@Value
@Builder
public class Book {
        private String bookName;
        private String authorBook;
        private boolean available;
    }
