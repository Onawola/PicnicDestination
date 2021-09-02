package com.mycompany.picnicdestination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SingleConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/PicnicDb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static Connection ConnectionDb = null;

    static {
        connect();
    }

    public SingleConnection() {
        connect();
    }

    // Open a connection
    public static void connect() {
        if (ConnectionDb == null) {
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                // Handle errors for Class.forName
                ex.printStackTrace();
            }
            try {
                ConnectionDb = DriverManager.getConnection(URL, USER, PASSWORD);
                ConnectionDb.setAutoCommit(false);
            } catch (SQLException ex) {
                // Handle errors for JDBC
                ex.printStackTrace();
            }
        }
    }

    // Create a single instance of connection using singleton pattern
    public static Connection getConnection() {
        return ConnectionDb;
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void closeResultSet(ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
