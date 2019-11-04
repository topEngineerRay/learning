package com.dr.mutiplethreads.chapter3.notifyAll;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		Object lock = new Object();
		//下面所有的线程都是用的这一个对象
		ThreadA a = new ThreadA(lock);
		a.start();

		ThreadB b = new ThreadB(lock);
		b.start();

		ThreadC c = new ThreadC(lock);
		c.start();

		Thread.sleep(1000);

		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();

	}

}
