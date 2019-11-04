package com.dr.designPattern.proxy.dynamicProxy.general;

public class MyAfterAdvice implements IAdvice{
    @Override public void exec() {
        System.out.println("后置通知执行");
    }
}
