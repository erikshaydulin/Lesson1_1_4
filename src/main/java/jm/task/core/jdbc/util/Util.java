package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static final String HOST = "jdbc:mysql://localhost:3306/mydbtest";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root1234";

    Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Util () {
        try {
            Connection connection = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
