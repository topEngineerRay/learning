package com.dr.mutiplethreads.chapter1.t13;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {//判断线程是否已经是停止状态
				System.out.println("已经是停止状态了!我要退出了");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
	}
}
