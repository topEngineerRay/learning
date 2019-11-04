package com.dr.mutiplethreads.chapter6.singleton1.extthread;

import com.dr.mutiplethreads.chapter6.singleton1.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
