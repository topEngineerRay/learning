package com.dr.designPattern.proxy.dynamicProxy.general;

import java.lang.reflect.InvocationHandler;

public class Client {
    public static void main(String[] args){
        //定义一个主题
        Subject subject = new SubjectImpl();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);

        //定义主题的一个代理，注意这个代理依然是一个Subject类型
        Subject proxy = (Subject) DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        proxy.doSomething("do something");

        Subject proxyNew = SubjectDynamicProxy.newProxyInstance(subject);
        proxyNew.doSomething("do somthing new");

    }
}
