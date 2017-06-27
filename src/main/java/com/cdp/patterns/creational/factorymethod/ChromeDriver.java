package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public class ChromeDriver extends BaseDriver {

    @Override
    public String createDriver(){
        System.out.println("Create chrome driver, add capabilities, etc.");
        driver = "Chrome Driver";
        return driver;
    }
}
