package com.dr.mutiplethreads.chapter3.InheritableThreadLocal2.test;

import com.dr.mutiplethreads.chapter3.InheritableThreadLocal2.extthread.ThreadA;
import com.dr.mutiplethreads.chapter3.InheritableThreadLocal2.tools.Tools;

public class Run {

	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("       在main线程中取值ֵ=" + Tools.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA a = new ThreadA();
			a.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
