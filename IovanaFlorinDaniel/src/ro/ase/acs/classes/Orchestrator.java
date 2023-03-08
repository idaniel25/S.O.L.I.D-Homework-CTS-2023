package ro.ase.acs.classes;

import ro.ase.acs.interfaces.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Orchestrator {
    private final DatabaseConnection databaseConnection;
    private final TableCreation tableCreation;
    private DataInsertion dataInsertion;
    private final DataReading dataReading;
    private final DataWriting dataWriting;

    public Orchestrator(DatabaseConnection databaseConnection, TableCreation tableCreation, DataInsertion dataInsertion, DataReading dataReading, DataWriting dataWriting) {
        this.databaseConnection = databaseConnection;
        this.tableCreation = tableCreation;
        this.dataInsertion = dataInsertion;
        this.dataReading = dataReading;
        this.dataWriting = dataWriting;
    }

    public void setDataInsertion(DataInsertion dataInsertion) {
        this.dataInsertion = dataInsertion;
    }

    public void runWorkFlow() {
        try {
            Connection connection = databaseConnection.getConnection();
            tableCreation.createTable(connection);

            dataInsertion.insertData(connection);

            ResultSet resultSet = dataReading.readData(connection);
            dataWriting.displayData(resultSet);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
