package com.dr.mutiplethreads.chapter6.singleton1.test.run;

import com.dr.mutiplethreads.chapter6.singleton1.extthread.MyThread;

public class Run {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
	}

}
