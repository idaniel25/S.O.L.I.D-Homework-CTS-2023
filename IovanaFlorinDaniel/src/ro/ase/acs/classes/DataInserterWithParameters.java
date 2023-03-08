package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataInsertion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInserterWithParameters implements DataInsertion {
    public static final String INSERT_EMPLOYEE_QUERY_WITH_PARAMS = "INSERT INTO employees VALUES (?,?,?,?)";

    @Override
    public void insertData(Connection connection) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement(INSERT_EMPLOYEE_QUERY_WITH_PARAMS);
        preparedStatement.setInt(1, 2);
        preparedStatement.setString(2, "Ionescu Vasile");
        preparedStatement.setString(3, "Brasov");
        preparedStatement.setDouble(4, 4500);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
