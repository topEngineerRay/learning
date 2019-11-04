package com.dr.mutiplethreads.chapter1.randomThread;

public class Test {
	public static void main(String[] args) {
		try {
			//线程调用的随机性
			MyThread thread = new MyThread();
			thread.setName("myThread");
			thread.start();

			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
