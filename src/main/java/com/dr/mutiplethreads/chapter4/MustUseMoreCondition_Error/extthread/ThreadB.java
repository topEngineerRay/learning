package com.dr.mutiplethreads.chapter4.MustUseMoreCondition_Error.extthread;

import com.dr.mutiplethreads.chapter4.MustUseMoreCondition_Error.service.MyService;

public class ThreadB extends Thread {

	private MyService service;

	public ThreadB(MyService service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}
