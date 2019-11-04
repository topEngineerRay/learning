package com.dr.mutiplethreads.chapter2.volatileTestThread;

public class MyThread extends Thread {
	volatile public static int count;

	private static void addCount() {
		for (int i = 0; i < 100; i++) {
			count++;
		}
		System.out.println("count=" + count);
	}

	@Override
	public void run() {
		addCount();
	}

}
