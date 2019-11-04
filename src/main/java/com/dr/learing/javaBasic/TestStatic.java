package com.dr.learing.javaBasic;

import java.util.ArrayList;
import java.util.List;

public class TestStatic {
    /*
    static 方法
    static方法一般称作静态方法，由于静态方法不依赖于任何对象就可以进行访问，因此对于静态方法来说
    要注意的是，虽然在静态方法中不能访问非静态成员方法和非静态成员变量，但是在非静态成员方法中是可以访问静态成员方法/变量的
    方便在没有创建对象的情况下来进行调用（方法/变量）

     */
    /*
    static 变量
    static变量也称作静态变量，静态变量和非静态变量的区别是：静态变量被所有的对象所共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。

　　static成员变量的初始化顺序按照定义的顺序进行初始化。
     */
    /*
    static 代码块
    static关键字还有一个比较关键的作用就是 用来形成静态代码块以优化程序性能。static块可以置于类中的任何地方，类中可以有多个static块。在类初次被加载的时候，会按照static块的顺序来执行每个static块，并且只会执行一次。

　　为什么说static块可以用来优化程序性能，是因为它的特性:只会在类加载的时候执行一次
     */
    public static void main(String[] args){
        System.out.println("222");

        A.print();

        A aa = new A();
        aa.print();

        System.out.println(A.number);
        System.out.println(aa.number);
        List a = new ArrayList<>();
        a.add("!");
    }

    private static class A{
        private  static  int number = 10;
        private static void print(){
            System.out.println("111");
        }
    }
    static {
        System.out.println("i am a static code block");
    }

}


