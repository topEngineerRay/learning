package com.dr.mutiplethreads.chapter3.s5.test;

import com.dr.mutiplethreads.chapter3.s5.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.s5.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		try {
			ThreadA a = new ThreadA();
			a.start();

			Thread.sleep(1000);

			ThreadB b = new ThreadB();
			b.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
