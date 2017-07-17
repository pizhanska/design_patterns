package com.cdp.patterns.structural.decorator;

/**
 * Created by Uliana Pizhanska on 18/07/2017.
 */
public class ButtonDecorator extends BaseDecorator {

    public ButtonDecorator(Element element){
        super(element);
    }

    @Override
    public void click(){
        // add some features
        System.out.println("Change color of button to red");
        super.click();
    }

}
