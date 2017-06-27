package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public class DriverFactory {
    public enum DriverType {CHROME, FIREFOX;}

    public static BaseDriver getDriver(DriverType type){
        BaseDriver baseDriver;

        switch (type){
            case CHROME:
                baseDriver = new ChromeDriver();
                break;
            case FIREFOX:
                baseDriver = new FirefoxDriver();
                break;
            default:
                baseDriver = new IEDriver();
                break;
        }
        return baseDriver;
    }
}
