package com.dr.learning.rex;

public class StaticFactoryMethod {
    
    private String aString;
    
    StaticFactoryMethod(String aString) {
        this.aString=aString;
    }
    public static StaticFactoryMethod staticFactory(String aString ){
        return new StaticFactoryMethod(aString);
    }//this is a static factory method 
    
}
