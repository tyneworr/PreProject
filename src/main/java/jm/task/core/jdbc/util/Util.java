package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/tyneworr";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "10071993root!";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        }  catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}