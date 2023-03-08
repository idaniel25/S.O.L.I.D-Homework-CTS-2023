package ro.ase.acs.main;

import ro.ase.acs.classes.*;

public class Main {

    public static void main(String[] args) {
        Orchestrator orchestrator = new Orchestrator(new DatabaseConnector(),new TableCreator(), new DataInserter(), new DataReader(), new DataWriter());
        orchestrator.runWorkFlow();
        orchestrator.setDataInsertion(new DataInserterWithParameters());
        orchestrator.runWorkFlow();
    }
}
