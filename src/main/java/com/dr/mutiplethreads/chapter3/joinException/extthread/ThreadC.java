package com.dr.mutiplethreads.chapter3.joinException.extthread;

public class ThreadC extends Thread {

	private ThreadB threadB;

	public ThreadC(ThreadB threadB) {
		super();
		this.threadB = threadB;
	}

	@Override
	public void run() {
		threadB.interrupt();
	}

}
