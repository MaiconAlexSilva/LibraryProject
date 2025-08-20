package com.libraryproject.service;


import com.libraryproject.domain.Book;
import com.libraryproject.domain.BookManager;


public class BookService {
    public static void newBook (Book book){
        BookManager.newBook(book);
    }
}