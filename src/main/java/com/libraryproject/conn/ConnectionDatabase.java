package com.libraryproject.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDatabase {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/project_library";
        String username = "root";
        String password = "root";
            return DriverManager.getConnection(url, username, password);
    }
}
