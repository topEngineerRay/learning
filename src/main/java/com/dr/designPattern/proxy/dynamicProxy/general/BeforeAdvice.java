package com.dr.designPattern.proxy.dynamicProxy.general;



public class BeforeAdvice implements IAdvice {
    @Override public void exec() {
        System.out.println("前置通知执行");
    }
}
