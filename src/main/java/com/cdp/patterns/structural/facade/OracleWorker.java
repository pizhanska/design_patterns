package com.cdp.patterns.structural.facade;

public class OracleWorker implements DBWorker {

    public void createConnection() {
        System.out.println("get Oracle DB connection using connection parameters");
    }

    public void executeQuery() {
        System.out.println("execute query on Oracle DB");
    }
}
