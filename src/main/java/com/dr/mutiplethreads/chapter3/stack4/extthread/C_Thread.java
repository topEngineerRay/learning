package com.dr.mutiplethreads.chapter3.stack4.extthread;

import com.dr.mutiplethreads.chapter3.stack4.service.C;

public class C_Thread extends Thread {

	private C r;

	public C_Thread(C r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.popService();
		}
	}

}
