package com.dr.mutiplethreads.chapter3.test2;

public class MyThread2 extends Thread {
	private Object lock;

	public MyThread2(Object lock) {
		super();
		this.lock = lock;
		//？经过这一步之和两个线程直接是否是锁的一个对象，
		// 答案，是的，每个线程只是存放了一个引用，内存里面的lock对象始终是同一个
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("开始notify time=" + System.currentTimeMillis());
			lock.notify();
			System.out.println("结束notify time=" + System.currentTimeMillis());
		}
	}
}
