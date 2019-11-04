package com.dr.mutiplethreads.chapter6.singleton_5.extthread;

import com.dr.mutiplethreads.chapter6.singleton_5.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
