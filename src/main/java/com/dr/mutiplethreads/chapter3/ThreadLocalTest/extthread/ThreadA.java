package com.dr.mutiplethreads.chapter3.ThreadLocalTest.extthread;

import com.dr.mutiplethreads.chapter3.ThreadLocalTest.tools.Tools;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set("ThreadA" + (i + 1));
				} else {
					System.out.println("ThreadA get Value=" + Tools.tl.get());
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
