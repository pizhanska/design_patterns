package com.cdp.patterns.creational.creational.factorymethod;

public class IEDriver extends BaseDriver {
    public String createDriver(){
        System.out.println("Create IE driver, add capabilities, etc.");
        driver = "IE Driver";
        return driver;
    }
}
