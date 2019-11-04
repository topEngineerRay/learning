package com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyError.extthread;

import com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyError.service.MyService;

public class ThreadA extends Thread {

	private MyService service;

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.await();
	}
}
