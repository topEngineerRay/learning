package com.dr.mutiplethreads.chapter1.t12;


public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			//Thread.currentThread().interrupt();
			//thread.interrupted()方法测试当前线程是否停止，这里的当前线程是main线程，不是thread.main线程
			//从未中断过，我们中断的是thread线程
			System.out.println("is 1 stopped? ="+thread.interrupted());
			System.out.println("is 2 stopped? ="+thread.interrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

