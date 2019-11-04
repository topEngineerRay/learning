package com.dr.mutiplethreads.chapter7.groupAddThread.test;

import com.dr.mutiplethreads.chapter7.groupAddThread.extthread.ThreadA;
import com.dr.mutiplethreads.chapter7.groupAddThread.extthread.ThreadB;

public class Run {

	public static void main(String[] args) {
		ThreadA aRunnable = new ThreadA();
		ThreadB bRunnable = new ThreadB();

		ThreadGroup group = new ThreadGroup("dr线程组");

		Thread aThread = new Thread(group, aRunnable);
		Thread bThread = new Thread(group, bRunnable);
		aThread.start();
		bThread.start();

		System.out.println("活动的线程数为：" + group.activeCount());
		System.out.println("线程组的名称为：" + group.getName());

	}
}
