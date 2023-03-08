package ro.ase.acs.interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataWriting {
    void displayData(ResultSet resultSet) throws SQLException;
}
