package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataReading;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataReader implements DataReading {

    public static final String SELECT_EMPLOYEES_QUERY = "SELECT * FROM employees";

    @Override
    public ResultSet readData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        return statement.executeQuery(SELECT_EMPLOYEES_QUERY);
    }
}

