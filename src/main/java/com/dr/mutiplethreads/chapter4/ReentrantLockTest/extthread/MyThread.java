package com.dr.mutiplethreads.chapter4.ReentrantLockTest.extthread;

import com.dr.mutiplethreads.chapter4.ReentrantLockTest.service.MyService;

public class MyThread extends Thread {

	private MyService service;

	public MyThread(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
