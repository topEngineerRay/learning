package com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyOK.test;

import com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyOK.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyOK.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

		Thread.sleep(3000);

		service.signal();

	}

}
