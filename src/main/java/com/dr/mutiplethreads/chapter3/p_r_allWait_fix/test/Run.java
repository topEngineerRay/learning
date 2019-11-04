package com.dr.mutiplethreads.chapter3.p_r_allWait_fix.test;

import com.dr.mutiplethreads.chapter3.p_r_allWait_fix.entity.C;
import com.dr.mutiplethreads.chapter3.p_r_allWait_fix.entity.P;
import com.dr.mutiplethreads.chapter3.p_r_allWait_fix.extthread.ThreadP;
import com.dr.mutiplethreads.chapter3.p_r_allWait_fix.extthread.ThreadR;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//这里最大的却别是在唤醒的时候不是唤醒一个线程而是唤醒了所有线程
		String lock = new String("");
		P p = new P(lock);
		C r = new C(lock);

		ThreadP[] pThread = new ThreadP[2];
		ThreadR[] rThread = new ThreadR[2];

		for (int i = 0; i < 2; i++) {
			pThread[i] = new ThreadP(p);
			pThread[i].setName("生产者" + (i + 1));

			rThread[i] = new ThreadR(r);
			rThread[i].setName("消费者" + (i + 1));

			pThread[i].start();
			rThread[i].start();
		}

		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread()
				.getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);

		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName() + " "
					+ threadArray[i].getState());
		}
	}

}
