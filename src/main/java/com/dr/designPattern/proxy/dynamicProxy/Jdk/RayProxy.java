package com.dr.designPattern.proxy.dynamicProxy.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RayProxy implements InvocationHandler {

    Object object = null;

    public RayProxy(Object _object) {
        this.object = _object;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
