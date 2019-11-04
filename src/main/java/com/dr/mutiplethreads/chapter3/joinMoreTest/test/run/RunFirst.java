package com.dr.mutiplethreads.chapter3.joinMoreTest.test.run;

import com.dr.mutiplethreads.chapter3.joinMoreTest.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.joinMoreTest.extthread.ThreadB;

public class RunFirst {

	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		ThreadA a = new ThreadA(b);
		a.start();
		b.start();
		System.out.println("   main end=" + System.currentTimeMillis());
	}

}
