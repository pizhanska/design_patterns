package com.cdp.patterns.structural.facade;

public class MySQLWorker implements DBWorker{
    public void createConnection() {
        System.out.println("get MySQL DB connection using connection parameters");
    }

    public void executeQuery() {
        System.out.println("execute query on MySQL DB");
    }
}
