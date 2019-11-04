package com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.extthread;

import com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.service.MyService;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}
