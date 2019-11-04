package com.dr.mutiplethreads.chapter1.t11;


public class Run {

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			//并不是停止当前线程，实在main方法里面停止另一个线程thread
			thread.interrupt();
			//interrupt方法并没有真的停止线程，仅仅是在当前线程打了一个停止的标记
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
	}

}
