package com.example.Dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager{

    public static final String PASSWORD = "";
    public static final String USERNAME = "gitpod";
    public static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static Connection getConnetion() throws SQLException {
        return DriverManager.getConnection(ConnectionManager.JDBC_URL, ConnectionManager.USERNAME, ConnectionManager.PASSWORD);
    }

}