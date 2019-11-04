package com.dr.mutiplethreads.chapter3.p_r_allWait_fix.extthread;

import com.dr.mutiplethreads.chapter3.p_r_allWait_fix.entity.C;

public class ThreadR extends Thread {

	private C r;

	public ThreadR(C r) {
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
