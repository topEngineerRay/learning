package com.dr.mutiplethreads.chapter6.singleton_9.extthread;

import com.dr.mutiplethreads.chapter6.singleton_9.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject.connectionFactory.getConnection()
					.hashCode());
		}
	}
}
