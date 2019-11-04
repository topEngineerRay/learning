package com.dr.mutiplethreads.chapter6.Singleton_2_2.test;

public class MyObject {

	private static MyObject myObject;

	private MyObject() {
	}

	// 此种写法等同于
	//synchronized public static MyObject getInstance() {
	// 的写法，效率一样很低，全部代码被上锁
	public static MyObject getInstance() {
		try {
			synchronized(MyObject.class) {
			if (myObject != null) {
			} else {
					// 模拟在创建对象之前做一些准备性的工作
					Thread.sleep(3000);
					myObject = new MyObject();
					}
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return myObject;
	}

}
