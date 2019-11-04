package com.dr.mutiplethreads.chapter3.waitOld.extthread;

import com.dr.mutiplethreads.chapter3.waitOld.entity.Add;

public class ThreadAdd extends Thread {

	private Add p;

	public ThreadAdd(Add p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		p.add();
	}

}
