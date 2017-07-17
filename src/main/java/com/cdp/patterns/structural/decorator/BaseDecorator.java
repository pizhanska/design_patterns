package com.cdp.patterns.structural.decorator;

public class BaseDecorator implements Element{

    protected Element decoratedElement;

    public BaseDecorator(Element decoratedElement){
        this.decoratedElement = decoratedElement;
    }
    public void click(){
        this.decoratedElement.click();
    }
}
