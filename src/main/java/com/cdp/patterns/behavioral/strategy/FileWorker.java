package com.cdp.patterns.behavioral.strategy;

public interface FileWorker {
    void writeFile(String fileName);
    void readFile(String fileName);
}
