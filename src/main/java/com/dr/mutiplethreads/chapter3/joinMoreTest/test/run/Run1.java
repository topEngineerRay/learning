package com.dr.mutiplethreads.chapter3.joinMoreTest.test.run;

import com.dr.mutiplethreads.chapter3.joinMoreTest.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.joinMoreTest.extthread.ThreadB;

public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
			b.join(2000);
			System.out.println("                    main end "
					+ System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
