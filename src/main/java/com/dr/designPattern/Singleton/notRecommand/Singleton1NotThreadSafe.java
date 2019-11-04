package com.dr.designPattern.Singleton.notRecommand;

public class Singleton1NotThreadSafe {
    //lazy loading，线程不安全,不推荐
    private Singleton1NotThreadSafe() {


    }

    private static Singleton1NotThreadSafe instance;

    //private static Singleton1 getInstance() {//需要定义为public供外部访问
    public static Singleton1NotThreadSafe getInstance() {

        if (instance == null) {
            //private 构造方法，在类的内部是可以调用的
            return new Singleton1NotThreadSafe();
        }

        return instance;
    }
}
