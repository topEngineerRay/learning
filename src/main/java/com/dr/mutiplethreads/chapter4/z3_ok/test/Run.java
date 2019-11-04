package com.dr.mutiplethreads.chapter4.z3_ok.test;

import com.dr.mutiplethreads.chapter4.z3_ok.extthread.MyThreadA;
import com.dr.mutiplethreads.chapter4.z3_ok.service.MyService;

public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThreadA a = new MyThreadA(myService);
		a.start();
	}
}
