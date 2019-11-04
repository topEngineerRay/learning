package com.dr.mutiplethreads.chapter1.t17Yield;

public class MyThread extends Thread {

	@Override
	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 5000000; i++) {
			Thread.yield();
			//让线程放弃cpu资源,将它让给其他任务。但是放弃的时间不确定，若注释则运行会非常快
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("用时" + (endTime - beginTime) + "毫秒");
	}

}
