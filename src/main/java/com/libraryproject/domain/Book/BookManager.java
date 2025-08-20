package com.libraryproject.domain.Book;


import com.libraryproject.conn.ConnectionDatabase;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Log4j2
public class BookManager {
    public static void newBook(Book book){
        String sql = "INSERT INTO `project_library`.`Book` (`book_name`, `author_name`) VALUES ('%s', '%s');"
                .formatted(book.getBookName(), book.getAuthorBook());
        try {Connection conn = ConnectionDatabase.getConnection();
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Rows Affected '{}' ", rowsAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void deletBook(int id){
        String sql = "DELETE FROM `project_library`.`Book` WHERE (`idBook` = '%d');"
                .formatted(id);
        try {Connection conn = ConnectionDatabase.getConnection();
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Rows Affected '{}' ", rowsAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateBook(Book book){
        //"UPDATE `anime_store`.`producer` SET `name` = '%s ' WHERE (`id` = '%d');"
        String sql = "UPDATE `project_library`.`Book` SET `book_name` = '%s', `author_name` = '%s' WHERE (`idBook` = '%d');"
                .formatted(book.getBookName(), book.getAuthorBook(), book.getId());
        try {Connection conn = ConnectionDatabase.getConnection();
            Statement stmt = conn.createStatement();
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Rows Affected '{}' ", rowsAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}

