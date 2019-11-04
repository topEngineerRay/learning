package com.dr.mutiplethreads.chapter2.synchronizedMethodLockObject;

public class MyObject {

	synchronized public void methodA() {
	//如果不加synchronized则两个线程可同时进入methodA方法。若加入synchronized，则声明的方法一定是排队运行的
	//public void methodA() {
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
