package com.libraryproject.service;


import com.libraryproject.domain.Book;
import com.libraryproject.domain.BookManager;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class BookService {
    public static void newBook (Book book){
        BookManager.newBook(book);
    }

    public static void deleteBook (int id){
        idChecker(id);
        BookManager.deletBook(id);
    }

    public static void updateBook (Book book){
        BookManager.updateBook(book);
    }


    private static void idChecker(int id){
        if (id <= 0){
            throw new IllegalArgumentException("ID cannot be less than or equal to zero");
        }
    }
}