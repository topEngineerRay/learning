package com.dr.mutiplethreads.chapter4.awaitUntil.extthread;

import com.dr.mutiplethreads.chapter4.awaitUntil.service.Service;

public class MyThreadB extends Thread {

	private Service service;

	public MyThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.notifyMethod();
	}

}
