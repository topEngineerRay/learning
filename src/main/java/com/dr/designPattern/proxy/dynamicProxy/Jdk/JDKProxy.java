package com.dr.designPattern.proxy.dynamicProxy.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * JDK动态代理类
 *
 *
 */
public class JDKProxy implements InvocationHandler {
  /*  @Override public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }*/

    private Object target;
    //根据目标对象创建代理对象，被代理的对象必须实现一个接口
    public Object newProxy(Object targetObject) {
        Object object = Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
        target = targetObject;
        return object;
        /*
         注意这里上面这个newProxyInstance方法传入的参数是接口，用的是class.getClass().getInterfaces()
         和class.getClass().getClassLoader(),在这里用了反射。

         它生成的代理类需要实现传入的接口，并通过反射来得到接口的方法对象
         并将此方法对象传参给增强类（上文中的WavingInvocationHandler类）的invoke方法去执行，
         从而实现了代理功能，故接口是jdk动态代理的核心实现方式，没有它就无法通过反射找到方法，所以这也是必须有接口的原因

         可以猜测到接口创建的新类proxyClassFile 不管采用什么接口，都是以下结构
         public class $Proxy1 extends Proxy implements 传入的接口{

        }
        因此：JDK的动态代理是靠多态和反射来实现的
        */
    }

    //实现InvocationHandler的 invoke方法
    public Object invoke(Object proxy, Method method, Object[] args)//invoke方法
            throws Throwable {
        checkPopedom();    //一般我们进行逻辑处理的函数比如这个地方是模拟检查权限
        Object ret = null;      // 设置方法的返回值
        ret  = method.invoke(target, args);       //调用invoke方法，ret存储该方法的返回值,通过反射获取代理方法然后进行调用，而在cglib中则是直接调用的，因为继承的缘故
        return ret;
    }

    private void checkPopedom() {//模拟检查权限的例子
        System.out.println(".:检查权限  checkPopedom()!");
    }
}
