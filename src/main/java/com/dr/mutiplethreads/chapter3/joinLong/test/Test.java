package com.dr.mutiplethreads.chapter3.joinLong.test;

import com.dr.mutiplethreads.chapter3.joinLong.extthread.MyThread;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();

			threadTest.join(2000);// ֻ只等2秒
			//Thread.sleep(2000);

			System.out.println("  end timer=" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
