package com.dr.mutiplethreads.chapter1.t1;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
