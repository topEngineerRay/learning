package com.dr.mutiplethreads.DeadLock;

public class Main {
    public static void main(String[] args){
        ObjectA a = new ObjectA();
        ObjectB b = new ObjectB();
        /*
        Thread threadAa = new Thread(new ThreadA(a,b));
        threadAa.start();
        Thread threadBb = new Thread(new ThreadB(a,b));
        threadBb.start();
        */
        //两种多线程实现方式
        Thread thread1 = new ThreadA1(a,b);
        Thread thread2 = new ThreadB1(a,b);
        thread1.start();
        thread2.start();

    }
   /* public static class ObjectA{

    }
    public static class ObjectB{

    }*/
}
