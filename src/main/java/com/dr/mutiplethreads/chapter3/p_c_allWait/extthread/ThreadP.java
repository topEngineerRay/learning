package com.dr.mutiplethreads.chapter3.p_c_allWait.extthread;

import com.dr.mutiplethreads.chapter3.p_c_allWait.entity.P;

public class ThreadP extends Thread {

	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.setValue();
		}
	}

}
