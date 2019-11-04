package com.dr.mutiplethreads.chapter7.stateTest4.extthread;

import com.dr.mutiplethreads.chapter7.stateTest4.service.Lock;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
