package com.dr.mutiplethreads.chapter4.ReadWriteLockBegin1.test;

import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin1.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin1.extthread.ThreadB;
import com.dr.mutiplethreads.chapter4.ReadWriteLockBegin1.service.Service;

public class Run {

	public static void main(String[] args) {

		Service service = new Service();

		ThreadA a = new ThreadA(service);
		a.setName("A");

		ThreadB b = new ThreadB(service);
		b.setName("B");

		a.start();
		b.start();

	}

}
