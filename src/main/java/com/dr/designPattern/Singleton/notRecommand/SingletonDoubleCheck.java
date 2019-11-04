package com.dr.designPattern.Singleton.notRecommand;

public class SingletonDoubleCheck {
    /*
     加锁的懒汉模式看起来即解决了线程并发问题，又实现了延迟加载，
     然而它存在着性能问题，依然不够完美。
     synchronized修饰的同步方法比一般方法要慢很多，如果多次调用getInstance()，累积的性能损耗就比较大了
     */

    //Double CheckLock实现单例：DCL也就是双重锁判断机制（由于JVM底层模型原因，偶尔会出问题，不建议使用）
    private SingletonDoubleCheck(){

    }

    private static SingletonDoubleCheck instance = null;

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {//1
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {//2
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
