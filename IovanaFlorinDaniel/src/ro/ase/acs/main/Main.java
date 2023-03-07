package ro.ase.acs.main;

import ro.ase.acs.classes.DataInserter;
import ro.ase.acs.classes.DataReader;
import ro.ase.acs.classes.DatabaseConnector;
import ro.ase.acs.classes.TableCreator;
import ro.ase.acs.interfaces.DataInsertion;
import ro.ase.acs.interfaces.DataReading;
import ro.ase.acs.interfaces.DatabaseConnection;
import ro.ase.acs.interfaces.TableCreation;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            DatabaseConnection databaseConnection = new DatabaseConnector();
            Connection connection = databaseConnection.getConnection();

            TableCreation tableCreation = new TableCreator();
            tableCreation.createTable(connection);

            DataInsertion dataInsertion = new DataInserter();
            dataInsertion.insertData(connection);

            DataReading dataReading = new DataReader();
            dataReading.readData(connection);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
