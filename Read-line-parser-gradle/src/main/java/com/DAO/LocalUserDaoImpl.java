package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class LocalUserDaoImpl implements ConnectionMaker{
    @Override
    public Connection makeConnection() {
        Map<String, String> env = System.getenv();
        String dbHost = env.get("DB_HOST");
        String dbName = env.get("DB_NAME");
        String dbPassword = env.get("DB_PASSWORD");
        Connection conn;

        try {
            conn = DriverManager.getConnection(dbHost, dbName, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
        return conn;
    }
}
