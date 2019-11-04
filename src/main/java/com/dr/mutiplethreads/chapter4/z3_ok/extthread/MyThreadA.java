package com.dr.mutiplethreads.chapter4.z3_ok.extthread;

import com.dr.mutiplethreads.chapter4.z3_ok.service.MyService;

public class MyThreadA extends Thread {

	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		myService.waitMethod();
	}

}
