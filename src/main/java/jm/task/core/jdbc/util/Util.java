package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String HOST = "jdbc:mysql://localhost:3306/mydbtest";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root1234";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
