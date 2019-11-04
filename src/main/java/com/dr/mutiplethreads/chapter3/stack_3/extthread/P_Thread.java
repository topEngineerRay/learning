package com.dr.mutiplethreads.chapter3.stack_3.extthread;

import com.dr.mutiplethreads.chapter3.stack_3.service.P;

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
