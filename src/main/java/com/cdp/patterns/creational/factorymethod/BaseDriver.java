package com.cdp.patterns.creational.factorymethod;


public abstract class BaseDriver {
    protected String driver;
    protected abstract String createDriver();

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
