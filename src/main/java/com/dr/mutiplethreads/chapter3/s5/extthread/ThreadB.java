package com.dr.mutiplethreads.chapter3.s5.extthread;

import com.dr.mutiplethreads.chapter3.s5.tools.Tools;

import java.util.Date;

public class ThreadB extends Thread {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				if (Tools.tl.get() == null) {
					Tools.tl.set(new Date());
				}
				System.out.println("B " + Tools.tl.get().getTime());
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
