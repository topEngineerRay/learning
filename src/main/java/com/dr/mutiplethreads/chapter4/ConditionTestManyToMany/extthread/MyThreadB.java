package com.dr.mutiplethreads.chapter4.ConditionTestManyToMany.extthread;

import com.dr.mutiplethreads.chapter4.ConditionTestManyToMany.service.MyService;

public class MyThreadB extends Thread {

	private MyService myService;

	public MyThreadB(MyService myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.get();
		}
	}

}
