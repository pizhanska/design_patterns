package com.cdp.patterns.creational.factorymethod;

/**
 * Created by Uliana Pizhanska on 28/06/2017.
 */
public abstract class BaseDriver {
    protected String driver;
    protected abstract void createDriver();

    public void quitDriver(){
        if(driver != null){
            System.out.println("driver.quit()");
            driver = null;
        }
    }

    public String getDriver(){
        if(driver == null){
            createDriver();
        }
        return driver;
    }
}
