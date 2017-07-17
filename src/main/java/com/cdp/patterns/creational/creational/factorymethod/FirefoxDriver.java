package com.cdp.patterns.creational.creational.factorymethod;

public class FirefoxDriver extends BaseDriver {
    public String createDriver(){
        System.out.println("Create firefox driver, add ff profile, etc");
        driver = "Firefox Driver";
        return driver;
    }
}
