package com.dr.mutiplethreads.chapter7.stateTest3.extthread;

import com.dr.mutiplethreads.chapter7.stateTest3.service.MyService;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}

}
