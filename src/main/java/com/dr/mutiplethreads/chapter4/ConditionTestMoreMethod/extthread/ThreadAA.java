package com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.extthread;

import com.dr.mutiplethreads.chapter4.ConditionTestMoreMethod.service.MyService;

public class ThreadAA extends Thread {

	private MyService service;

	public ThreadAA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodA();
	}
}
