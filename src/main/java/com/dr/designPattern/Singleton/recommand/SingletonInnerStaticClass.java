package com.dr.designPattern.Singleton.recommand;

public class SingletonInnerStaticClass {
    //线程安全，静态内部类
    private SingletonInnerStaticClass(){

    }

    /*
    通过静态内部类来实现
    只要应用中不使用内部类，JVM就不会去加载这个单例类，也就不会创建单例对象，
    从而实现懒汉式的延迟加载。也就是说这种方式可以同时保证延迟加载和线程安全。
    只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，从而实例化instance
    */

    private static class SingletonHolder{
        public static SingletonInnerStaticClass instance = new SingletonInnerStaticClass();
    }

    public static SingletonInnerStaticClass newInstance(){
        return SingletonHolder.instance;
    }
}
