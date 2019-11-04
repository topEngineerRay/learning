package com.dr.mutiplethreads.chapter1.t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		//MyThread类的构造方法是由main线程调用的，而run方法是被名为Thread-0的线程调用的，run方法是自动调用的方法
		//mythread.run();//如果这样写run方法是由main线程调用的
	}
}
