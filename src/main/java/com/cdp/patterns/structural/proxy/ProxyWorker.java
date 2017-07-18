package com.cdp.patterns.structural.proxy;


public class ProxyWorker implements DBWorker {
    private DBWorker worker;

    public void executeQuery() {
        if(worker == null){
            worker = new RealWorker();
        }
        worker.executeQuery();
    }
}
