package com.dr.mutiplethreads.chapter2.stringAndSyn;

public class ThreadA extends Thread {
	private Service service;
	public ThreadA(Service service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print("AA");
	}
}
