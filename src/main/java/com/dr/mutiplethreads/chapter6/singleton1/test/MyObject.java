package com.dr.mutiplethreads.chapter6.singleton1.test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	public static MyObject getInstance() {
		// 延迟加载
		if (myObject != null) {
		} else {
			myObject = new MyObject();
		}
		return myObject;
	}

}
