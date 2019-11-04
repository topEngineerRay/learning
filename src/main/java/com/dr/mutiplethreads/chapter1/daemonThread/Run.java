package com.dr.mutiplethreads.chapter1.daemonThread;

public class Run {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.setDaemon(true);//把MyThread线程设置为守护线程
			thread.start();
			Thread.sleep(4000);//main线程sleep五秒钟
			System.out.println("我离开thread对象也不再打印了，也就是停止了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
