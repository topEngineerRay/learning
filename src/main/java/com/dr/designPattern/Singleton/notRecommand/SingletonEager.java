package com.dr.designPattern.Singleton.notRecommand;

public class SingletonEager {
    //饿汉模式，eager Singleton,线程安全
    //instance在类装载时就实例化，这时候初始化instance显然没有达到lazy loading的效果。不推荐。
    /*
    一上来就把单例对象创建出来了，要用的时候直接返回即可，这种可以说是单例模式中最简单的一种实现方式。
    但是问题也比较明显。单例在还没有使用到的时候，初始化就已经完成了。
    也就是说，如果程序从头到位都没用使用这个单例的话，单例的对象还是会创建。
    这就造成了不必要的资源浪费。所以不推荐这种实现方式。
     */

    private SingletonEager(){

    }

    private static SingletonEager instance = new SingletonEager();//无人调用，主动实例化

    public static synchronized SingletonEager getInstance(){
        return instance;
    }

}
