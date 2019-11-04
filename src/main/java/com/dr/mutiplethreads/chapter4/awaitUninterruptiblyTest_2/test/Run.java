package com.dr.mutiplethreads.chapter4.awaitUninterruptiblyTest_2.test;

import com.dr.mutiplethreads.chapter4.awaitUninterruptiblyTest_2.extthread.MyThread;
import com.dr.mutiplethreads.chapter4.awaitUninterruptiblyTest_2.service.Service;

public class Run {

	public static void main(String[] args) {
		try {
			Service service = new Service();
			MyThread myThread = new MyThread(service);
			myThread.start();
			Thread.sleep(3000);
			myThread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
