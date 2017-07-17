package com.cdp.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String [] args){
        FileContext fileContext = new FileContext();
        fileContext.setWorker(new ExcelWorker());
        fileContext.manipulateFile("demo");

        fileContext.setWorker(new TextFileWorker());
        fileContext.manipulateFile("demo");
    }
}
