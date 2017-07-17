package com.cdp.patterns.behavioral.strategy;

public class TextFileWorker implements FileWorker {

    public void readFile(String fileName) {
        System.out.println("Read txt file" + fileName);
    }

    public void writeFile(String fileName) {
        System.out.println("Write txt file" + fileName);
    }
}
