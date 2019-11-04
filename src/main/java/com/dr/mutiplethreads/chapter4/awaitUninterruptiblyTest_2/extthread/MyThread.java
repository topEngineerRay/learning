package com.dr.mutiplethreads.chapter4.awaitUninterruptiblyTest_2.extthread;

import com.dr.mutiplethreads.chapter4.awaitUninterruptiblyTest_2.service.Service;

public class MyThread extends Thread {

	private Service service;

	public MyThread(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}

}
