package com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.extthread;

import com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.service.MyService;

public class ThreadBB extends Thread {

	private MyService service;

	public ThreadBB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
