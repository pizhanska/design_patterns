package com.cdp.patterns.structural.proxy;

public class ProxyDemo {
    public static void main(String [] args){
        DBWorker worker = new ProxyWorker();
        worker.executeQuery();
        System.out.println("////");
        worker.executeQuery();
    }
}
