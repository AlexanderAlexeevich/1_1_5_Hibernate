package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/new_schema";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Connection established");
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
        return conn;
    }






    // реализуйте настройку соеденения с БД
}
