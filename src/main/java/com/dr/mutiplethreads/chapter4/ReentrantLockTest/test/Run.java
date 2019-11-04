package com.dr.mutiplethreads.chapter4.ReentrantLockTest.test;

import com.dr.mutiplethreads.chapter4.ReentrantLockTest.extthread.MyThread;
import com.dr.mutiplethreads.chapter4.ReentrantLockTest.service.MyService;

public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		MyThread a1 = new MyThread(service);
		MyThread a2 = new MyThread(service);
		MyThread a3 = new MyThread(service);
		MyThread a4 = new MyThread(service);
		MyThread a5 = new MyThread(service);

		a1.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();

	}

}
