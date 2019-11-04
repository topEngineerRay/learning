package com.dr.learing.Aop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLibProxy动态代理类的实例
 * 被代理类是否实现接口对cglib实现没有影响
 *
 */
public class CGLibProxy implements MethodInterceptor {
  /*  @Override public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable {
        return null;
    }*/

   private Object targetObject;// CGLib需要代理的目标对象
    //根据目标对象生成一个子类作为他的代理类
    public Object createProxyObject(Object obj) {
        this.targetObject = obj;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());//设置父类为被代理类
        enhancer.setCallback(this);
        Object proxyObj = enhancer.create();
        //create 方法里用这个Superclass生成了子类
        return proxyObj;// 返回代理对象
        // 返回代理对象，返回的对象其实就是一个封装了“实现类”的代理类，是实现类的实例。
    }

    public Object intercept(Object proxy, Method method, Object[] args,
            MethodProxy methodProxy) throws Throwable {
        Object obj = null;
        if ("addUser".equals(method.getName())) {// 过滤方法
            checkPopedom();// 检查权限
        }
        obj = method.invoke(targetObject, args);
        return obj;
    }

    private void checkPopedom() {
        System.out.println(".:检查权限  checkPopedom()!");
    }
}