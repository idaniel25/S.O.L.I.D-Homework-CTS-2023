package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector implements DatabaseConnection {
    private final String DB_URL = "jdbc:sqlite:database.db";

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL);
    }
}

