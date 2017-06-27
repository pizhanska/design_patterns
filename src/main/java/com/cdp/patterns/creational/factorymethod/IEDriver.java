package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public class IEDriver extends BaseDriver {
    public String createDriver(){
        System.out.println("Create IE driver, add capabilities, etc.");
        driver = "IE Driver";
        return driver;
    }
}
