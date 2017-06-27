package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public class DriverFactoryDemo {
    public static BaseDriver baseDriver;
    public static String driver;
    public static void main(String[] args){
        baseDriver = DriverFactory.getDriver(DriverFactory.DriverType.CHROME);
        driver = baseDriver.createDriver();
        System.out.println(driver);

        baseDriver = DriverFactory.getDriver(DriverFactory.DriverType.FIREFOX);
        driver = baseDriver.createDriver();
        System.out.println(driver);
    }
}
