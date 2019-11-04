package com.dr.mutiplethreads.chapter1.t1;

public class Run {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		//自己写一个类继承Thread类，并且重写run方法
		mythread.start();
		System.out.println("运行结束");
		//先打印运行结束，后打印my thread，线程调用的随机性
	}

}
