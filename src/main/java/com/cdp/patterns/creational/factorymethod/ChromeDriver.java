package com.cdp.patterns.creational.factorymethod;

public class ChromeDriver extends BaseDriver {

    @Override
    public String createDriver(){
        System.out.println("Create chrome driver, add capabilities, etc.");
        driver = "Chrome Driver";
        return driver;
    }
}
