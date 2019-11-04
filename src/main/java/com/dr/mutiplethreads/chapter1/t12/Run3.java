package com.dr.mutiplethreads.chapter1.t12;


public class Run3 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(1000);//main线程sleep1秒钟
			thread.interrupt();
			//isInterrupted 测试线程Threads是否是中断状态，但不清楚状态
			System.out.println("is 1 stopped? ="+thread.isInterrupted());
			System.out.println("is 2 stopped? 	="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end!");
	}
}

