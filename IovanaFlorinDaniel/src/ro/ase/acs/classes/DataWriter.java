package ro.ase.acs.classes;

import ro.ase.acs.interfaces.DataWriting;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DataWriter implements DataWriting {

    @Override
    public void displayData(ResultSet resultSet) throws SQLException {
        while(resultSet.next()) {
            System.out.println("id: " + resultSet.getInt("id"));
            System.out.println("name: " + resultSet.getString("name"));
            System.out.println("address: " + resultSet.getString("address"));
            System.out.println("salary: " + resultSet.getDouble("salary"));
        }
        resultSet.close();
    }
}
