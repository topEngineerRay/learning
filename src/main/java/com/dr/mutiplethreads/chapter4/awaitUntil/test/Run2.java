package com.dr.mutiplethreads.chapter4.awaitUntil.test;

import com.dr.mutiplethreads.chapter4.awaitUntil.extthread.MyThreadA;
import com.dr.mutiplethreads.chapter4.awaitUntil.extthread.MyThreadB;
import com.dr.mutiplethreads.chapter4.awaitUntil.service.Service;

public class Run2 {

	public static void main(String[] args) throws InterruptedException {
		Service service = new Service();
		MyThreadA myThreadA = new MyThreadA(service);
		myThreadA.start();

		Thread.sleep(2000);

		MyThreadB myThreadB = new MyThreadB(service);
		myThreadB.start();
	}

}
