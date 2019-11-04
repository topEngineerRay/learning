package com.dr.mutiplethreads.chapter2.t8;

public class Task {

	//synchronized修饰方法和修饰代码块一样都是锁定的当前对象
	//重要，需要记住
	synchronized public void otherMethod() {
		System.out.println("------------------------run--otherMethod");
	}

	public void doLongTimeTask() {
		synchronized (this) {
			for (int i = 0; i < 10000; i++) {
				System.out.println("synchronized threadName="
						+ Thread.currentThread().getName() + " i=" + (i + 1));
			}
		}

	}
}
