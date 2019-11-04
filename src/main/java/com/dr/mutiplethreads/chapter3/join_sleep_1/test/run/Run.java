package com.dr.mutiplethreads.chapter3.join_sleep_1.test.run;

import com.dr.mutiplethreads.chapter3.join_sleep_1.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.join_sleep_1.extthread.ThreadB;
import com.dr.mutiplethreads.chapter3.join_sleep_1.extthread.ThreadC;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();

			ThreadA a = new ThreadA(b);
			a.start();

			Thread.sleep(1000);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
