package com.dr.designPattern.Singleton.notRecommand;

public class SingletonThreadSafeButSlowLazyLoading {
    //lazy loading,线程安全，但是效率较慢，不推荐，同步锁锁的是对象，每次取对象都有加锁
    private SingletonThreadSafeButSlowLazyLoading() {

    }

    private static SingletonThreadSafeButSlowLazyLoading instance;

    public synchronized static SingletonThreadSafeButSlowLazyLoading getInstance() {

        if (instance == null) {
            //private 构造方法，在类的内部是可以调用的
            return new SingletonThreadSafeButSlowLazyLoading();
        }

        return instance;
    }
}
