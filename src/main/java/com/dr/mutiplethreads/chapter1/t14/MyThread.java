package com.dr.mutiplethreads.chapter1.t14;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			System.out.println("run begin");
			Thread.sleep(200000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			//在sleep的时候使用interrupt()停止，会进入catch语句，并清楚停止状态值
			System.out.println("在沉睡中被停止，进入catch!"+this.isInterrupted());
			e.printStackTrace();
		}
	}
}
