package com.dr.mutiplethreads.chapter2.twoStop;

public class Service {
	synchronized public void methodA() {
		System.out.println("methodA begin");
		boolean isContinueRun = true;
		//会永远停在这里,因为这两个方法都用synchronized修饰，所以他们只能同步执行
		while (isContinueRun) {
		}
		System.out.println("methodA end");
	}

	synchronized public void methodB() {
		System.out.println("methodB begin");
		System.out.println("methodB end");
	}
}
