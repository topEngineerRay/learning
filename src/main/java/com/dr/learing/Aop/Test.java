package com.dr.learing.Aop;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        //t.test();
        test1();
    }

    private void test() {
        UserManager userManager = (UserManager) new CGLibProxy()
                .createProxyObject(new UserManagerImpl());
        System.out.println("-----------CGLibProxy-------------");

        userManager.addUser("tom", "root");

        System.out.println("-----------JDKProxy-------------");

        JDKProxy jdkPrpxy = new JDKProxy();
        UserManager userManagerJDK = (UserManager) jdkPrpxy
                .newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }

    private static void test1() {
        UserManagerImpl userManagerCGLib = (UserManagerImpl) new CGLibProxy()
                .createProxyObject(new UserManagerImpl());
        System.out.println("-----------CGLibProxy-------------");

        userManagerCGLib.addUser("tom", "root");

        System.out.println("-----------JDKProxy-------------");
        //jdk 动态代理的代理类必须实现接口，返回类型必须是接口，不能是类，但是传入的被代理对象是一个实现了该接口的类
        JDKProxy jdkPrpxy = new JDKProxy();
        Object o = jdkPrpxy.newProxy(new UserManagerImpl());
        //UserManagerImpl userManagerjdk = (UserManagerImpl) o;
        UserManager userManagerJDK = (UserManager) jdkPrpxy.newProxy(new UserManagerImpl());
        userManagerJDK.addUser("tom", "root");
    }

}
