package com.dr.mutiplethreads.chapter6.singleton_8.test;


public class MyObject {

	private static MyObject instance = null;

	private MyObject() {
	}

	static {
		instance = new MyObject();
	}

	public static MyObject getInstance() {
		return instance;
	}

}
