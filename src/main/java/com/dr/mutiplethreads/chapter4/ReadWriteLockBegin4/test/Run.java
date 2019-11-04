package com.dr.mutiplethreads.chapter4.ReadWriteLockBegin4.test;

import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin4.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin4.extthread.ThreadB;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin4.service.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		Service service = new Service();

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

		Thread.sleep(1000);

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

	}

}
