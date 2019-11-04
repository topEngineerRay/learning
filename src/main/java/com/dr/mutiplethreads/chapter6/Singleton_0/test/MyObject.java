package com.dr.mutiplethreads.chapter6.Singleton_0.test;

public class MyObject {

	//立即加载==恶汉模式
	private static MyObject myObject = new MyObject();

	private MyObject() {
	}

	public static MyObject getInstance() {
		//此代码版本即为立即加载，缺点是不能有其他实例变量，
		//因为getInstance方法没有同步，所以有可能出现非线程安全问题
		return myObject;
	}

}
