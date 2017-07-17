package com.cdp.patterns.creational.builder;
import org.testng.annotations.*;
import org.testng.*;

public class BuilderDemo {

    @Test
    public void checkFullName(){
        Person person = new Person.Builder().firstName("Uliana").lastName("Pizhanska").build();
        Assert.assertEquals(person.getFullName(),"Uliana Pizhanska");
    }
}
