package com.dr.mutiplethreads.chapter2.stringAndSyn2;

public class Service {
	public static void print(Object object) {
		try {
			synchronized (object) {
				while (true) {
					System.out.println(Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
