package com.dr.mutiplethreads.chapter4.MustUseMoreCondition_OK.test;

import com.dr.mutiplethreads.chapter4.MustUseMoreCondition_OK.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.MustUseMoreCondition_OK.extthread.ThreadB;
import com.dr.mutiplethreads.chapter4.MustUseMoreCondition_OK.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		Thread.sleep(3000);

		service.signalAll_A();

	}

}
