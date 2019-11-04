package com.dr.mutiplethreads.chapter3.ThreadLocalTest.test;

import com.dr.mutiplethreads.chapter3.ThreadLocalTest.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.ThreadLocalTest.extthread.ThreadB;
import com.dr.mutiplethreads.chapter3.ThreadLocalTest.tools.Tools;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();
			a.start();
			b.start();

			for (int i = 0; i < 100; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set("Main" + (i + 1));
				} else {
					System.out.println("Main get Value=" + Tools.tl.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
