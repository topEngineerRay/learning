package com.dr.mutiplethreads.chapter3.firstNotify;

public class MyRun {

	private String lock = new String("");
	private boolean isFirstRunB = false;

	private Runnable runnableA = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					while (isFirstRunB == false) {
						System.out.println("begin wait");
						lock.wait();
						System.out.println("end wait");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	private Runnable runnableB = new Runnable() {
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("begin notify");
				lock.notify();
				System.out.println("end notify");
				isFirstRunB = true;

			}
		}
	};

	public static void main(String[] args) throws InterruptedException {

		MyRun run = new MyRun();
		//在notify的时候，并没有线程处于wait状态
/*
		Thread b = new Thread(run.runnableB);
		b.start();

		Thread.sleep(100);

		Thread a = new Thread(run.runnableA);
		a.start();
*/

		//在调整线程启动顺序之后，则在notify的时候，已经有线程处于wait状态了
		Thread a = new Thread(run.runnableA);
		a.start();

		Thread.sleep(100);

		Thread b = new Thread(run.runnableB);
		b.start();

	}
}
