package com.dr.mutiplethreads.chapter1.isaliveOtherTest;

public class Run {

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        /*
		c.setName("A");
		c.start();
		*/

        Thread t1 = new Thread(c);//注意CountOperate是以构造函数参数传入的
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }

}
