package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
    private DBConnector() {
        throw new IllegalStateException("Utility class");
    }

     public static Connection getConnection(){

        Connection conn=null;
        try {
            String url = "jdbc:postgresql://localhost:5432/test_db";
            String username = "root";
            String password = "root";

            conn = DriverManager.getConnection(url, username, password);
            return conn;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
