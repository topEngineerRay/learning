package com.dr.mutiplethreads.chapter3.InheritableThreadLocal1.extthread;

import com.dr.mutiplethreads.chapter3.InheritableThreadLocal1.tools.Tools;

public class ThreadA extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在ThreadA线程中取值" + Tools.tl.get());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
