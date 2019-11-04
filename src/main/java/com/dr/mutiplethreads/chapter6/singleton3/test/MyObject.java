package com.dr.mutiplethreads.chapter6.singleton3.test;

public class MyObject {

    private static MyObject myObject;

    private MyObject() {
    }

    public static MyObject getInstance() {
        try {

            if (myObject != null) {
            } else {
                // 模拟在创建对象之前做一些准备性的工作
                Thread.sleep(3000);
                //使用synchronized语句块，只对实例化对象的关键代码同步，效率提升了，但是
                //但是多线程情况下还是无法解决得到同一个实例对象的结果
                synchronized (MyObject.class) {
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }

}
