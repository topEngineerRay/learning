package com.dr.designPattern.proxy.dynamicProxy.general;

import java.lang.reflect.InvocationHandler;

public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        //获得ClassLoader
        ClassLoader classLoader = subject.getClass().getClassLoader();
        //获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        //获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //调用父类方法
        return newProxyInstance(classLoader,classes,handler);
    }
}
