package com.dr.mutiplethreads.chapter3.p_r_test.test;

import com.dr.mutiplethreads.chapter3.p_r_test.entity.C;
import com.dr.mutiplethreads.chapter3.p_r_test.entity.P;
import com.dr.mutiplethreads.chapter3.p_r_test.extthread.ThreadC;
import com.dr.mutiplethreads.chapter3.p_r_test.extthread.ThreadP;

public class Run {

	public static void main(String[] args) {

		String lock = new String("");
		//使用同一个对象作为构造方法参数
		P p = new P(lock);
		C r = new C(lock);

		ThreadP pThread = new ThreadP(p);
		ThreadC rThread = new ThreadC(r);

		pThread.start();
		rThread.start();
	}

}
