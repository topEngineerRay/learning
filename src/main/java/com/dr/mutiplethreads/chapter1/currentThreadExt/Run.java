package com.dr.mutiplethreads.chapter1.currentThreadExt;

public class Run {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		c.setName("A");
		c.start();
		//这种实现和下面这种实现是一样的
		/*
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
		*/
	}

}
