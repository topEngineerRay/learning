package com.dr.mutiplethreads.chapter1.t18;

public class MyThread2 extends Thread {
	@Override
	public void run() {
		System.out.println("MyThread2 run priority=" + this.getPriority());
	}
}
