package com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.extthread;

import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.service.Service;

public class ThreadB extends Thread {

	private Service service;

	public ThreadB(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}
