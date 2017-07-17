package com.cdp.patterns.structural.decorator;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public class CheckBoxDecorator extends BaseDecorator {

    public CheckBoxDecorator(Element element){
        super(element);
    }

    @Override
    public void click(){
        // add other features
        System.out.println("Highlighted checkbox");
        super.click();
    }
}
