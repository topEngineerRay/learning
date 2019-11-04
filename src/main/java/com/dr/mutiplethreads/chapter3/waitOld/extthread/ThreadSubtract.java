package com.dr.mutiplethreads.chapter3.waitOld.extthread;

import com.dr.mutiplethreads.chapter3.waitOld.entity.Subtract;

public class ThreadSubtract extends Thread {

	private Subtract r;

	public ThreadSubtract(Subtract r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		r.subtract();
	}

}
