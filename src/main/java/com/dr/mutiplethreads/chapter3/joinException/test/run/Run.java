package com.dr.mutiplethreads.chapter3.joinException.test.run;

import com.dr.mutiplethreads.chapter3.joinException.extthread.ThreadB;
import com.dr.mutiplethreads.chapter3.joinException.extthread.ThreadC;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadB b = new ThreadB();
			b.start();

			Thread.sleep(500);

			ThreadC c = new ThreadC(b);
			c.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
