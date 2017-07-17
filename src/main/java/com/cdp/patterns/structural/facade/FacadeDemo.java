package com.cdp.patterns.structural.facade;

public class FacadeDemo {

    public static void main(String [] args){
        FacadeHelper.executeQuery(FacadeHelper.DBTypes.MYSQL);
        FacadeHelper.executeQuery(FacadeHelper.DBTypes.ORACLE);
    }
}
