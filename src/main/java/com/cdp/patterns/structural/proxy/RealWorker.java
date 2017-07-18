package com.cdp.patterns.structural.proxy;

public class RealWorker implements DBWorker {

    public RealWorker(){
       createConnection();
    }

    public void executeQuery() {
        System.out.println("Query is executed");
    }

    public void createConnection(){
        System.out.println("Connection is created");
    }
}
