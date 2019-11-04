package com.dr.mutiplethreads.chapter6.Singleton_2_2.extthread;

import com.dr.mutiplethreads.chapter6.Singleton_2_2.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
