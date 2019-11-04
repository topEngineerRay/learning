package com.dr.mutiplethreads.chapter3.stack_2_old.extthread;

import com.dr.mutiplethreads.chapter3.stack_2_old.service.P;

public class P_Thread extends Thread {

	private P p;

	public P_Thread(P p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.pushService();
		}
	}

}
