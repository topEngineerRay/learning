package com.dr.mutiplethreads.chapter2.synLockIn_2;

public class MyThread extends Thread {
	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateISubMethod();
	}

}
