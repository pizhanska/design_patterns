package com.cdp.patterns.behavioral.strategy;

public class FileContext {
    private FileWorker worker;

    public void setWorker(FileWorker worker){
        this.worker = worker;
    }

    public void manipulateFile(String fileName){
        worker.writeFile(fileName);
        worker.readFile(fileName);
    }
}
