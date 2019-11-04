package com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.test;

import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.extthread.ThreadB;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin3.service.Service;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");
		a.start();

		Thread.sleep(1000);

		ThreadB b = new ThreadB(service);
		b.setName("B");
		b.start();

	}

}
