package ro.ase.acs.interfaces;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface DataReading {
    ResultSet readData(Connection connection) throws SQLException;
}
