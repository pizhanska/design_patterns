package com.cdp.patterns.creational.creational.factorymethod;

public class DriverFactoryDemo {
    private static BaseDriver baseDriver;
    private static String driver;
    public static void main(String[] args){
        baseDriver = DriverFactory.getDriver(DriverFactory.DriverType.CHROME);
        driver = baseDriver.createDriver();
        System.out.println(driver);

        baseDriver = DriverFactory.getDriver(DriverFactory.DriverType.FIREFOX);
        driver = baseDriver.createDriver();
        System.out.println(driver);
    }
}
