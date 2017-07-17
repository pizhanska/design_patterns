package com.cdp.patterns.behavioral.strategy;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public class ExcelWorker implements FileWorker {

    public void readFile(String fileName) {
        System.out.println("Read xls file" + fileName);
    }

    public void writeFile(String fileName) {
        System.out.println("Write xls file" + fileName);
    }
}
