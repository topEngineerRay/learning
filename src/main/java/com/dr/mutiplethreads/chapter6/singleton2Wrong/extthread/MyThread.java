package com.dr.mutiplethreads.chapter6.singleton2Wrong.extthread;

import com.dr.mutiplethreads.chapter6.singleton2Wrong.test.MyObject;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(MyObject.getInstance().hashCode());
	}

}
