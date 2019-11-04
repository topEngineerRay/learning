package com.dr.mutiplethreads.chapter4.ConditionTestManyToMany.extthread;

import com.dr.mutiplethreads.chapter4.ConditionTestManyToMany.service.MyService;

public class MyThreadA extends Thread {

	private MyService myService;

	public MyThreadA(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.set();
		}
	}

}
