package com.dr.mutiplethreads.chapter2.synchronizedMethodLockObject;

public class Run {

	public static void main(String[] args) {
		//证明synchronized锁定的是对象
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(object);
		a.setName("A");
		ThreadB b = new ThreadB(object);
		b.setName("B");

		a.start();
		b.start();
	}

}
