package com.dr.mutiplethreads.chapter3.p_r_test.extthread;

import com.dr.mutiplethreads.chapter3.p_r_test.entity.C;

public class ThreadC extends Thread {

	private C r;

	public ThreadC(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.getValue();
		}
	}

}
