package com.dr.designPattern.proxy.dynamicProxy.general;

public class SubjectImpl implements Subject{
    @Override public void doSomething(String s) {
        System.out.println("do something-----" +s);
    }
}
