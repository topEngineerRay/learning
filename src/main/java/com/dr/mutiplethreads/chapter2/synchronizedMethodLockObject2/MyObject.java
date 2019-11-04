package com.dr.mutiplethreads.chapter2.synchronizedMethodLockObject2;

public class MyObject {

	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName="
					+ Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("end endTime=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void methodB() {
	//对象里的同步方法，A线程先持有Object对象的Lock锁，则B线程只能同步调用对象中的synchronized方法
	//public void methodB() {//这是对象里的非同步方法，
		// A线程先持有Object对象的Lock锁，B线程可以以异步的方式调用对象中的非synchronized方法
		try {
			System.out.println("begin methodB threadName="
					+ Thread.currentThread().getName() + " begin time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
