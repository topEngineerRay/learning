package com.dr.mutiplethreads.chapter6.Singleton_0.test.run;

import com.dr.mutiplethreads.chapter6.Singleton_0.extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();

	}

}
