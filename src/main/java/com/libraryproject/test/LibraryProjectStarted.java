package com.libraryproject.test;

import com.libraryproject.domain.Book;
import com.libraryproject.service.BookService;

public class LibraryProjectStarted {
    public static void main(String[] args) {
        //Book book = Book.builder().bookName("gabi dog").authorBook("J.K Rowgling").build();
        Book bookUpdate = Book.builder().bookName("Naruto Shippuden").authorBook("Masashi Kishimoto").build();
        BookService.updateBook(bookUpdate);
        //BookService.newBook(book);
        //BookService.deleteBook();
    }
}
