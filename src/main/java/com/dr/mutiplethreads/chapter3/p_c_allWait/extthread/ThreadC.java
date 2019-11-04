package com.dr.mutiplethreads.chapter3.p_c_allWait.extthread;

import com.dr.mutiplethreads.chapter3.p_c_allWait.entity.C;

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
