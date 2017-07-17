package com.cdp.patterns.structural.facade;

public interface DBWorker {
    void createConnection();
    void executeQuery();
}
