package com.dr.mutiplethreads.chapter6.Singleton_0.extthread;

import com.dr.mutiplethreads.chapter6.Singleton_0.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
