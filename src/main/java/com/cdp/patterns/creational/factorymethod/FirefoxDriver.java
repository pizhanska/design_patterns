package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public class FirefoxDriver extends BaseDriver {
    public String createDriver(){
        System.out.println("Create firefox driver, add ff profile, etc");
        driver = "Firefox Driver";
        return driver;
    }
}
