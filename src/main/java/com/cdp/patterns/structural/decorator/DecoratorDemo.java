package com.cdp.patterns.structural.decorator;

public class DecoratorDemo {

    public static void main(String [] args){
        Element button = new ButtonDecorator(new BaseElement());
        button.click();
        System.out.println("\n");

        Element checkbox = new CheckBoxDecorator(new BaseElement());
        checkbox.click();
    }
}
