package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataInsertion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInserter implements DataInsertion {

    public static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO employees VALUES(1, 'Popescu Ion', 'Bucharest', 4000)";

    @Override
    public void insertData(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(INSERT_EMPLOYEE_QUERY);
        statement.close();
    }
}

