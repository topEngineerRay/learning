package com.dr.mutiplethreads.chapter4.ConditionTest.test;

import com.dr.mutiplethreads.chapter4.ConditionTest.extthread.MyThreadA;
import com.dr.mutiplethreads.chapter4.ConditionTest.extthread.MyThreadB;
import com.dr.mutiplethreads.chapter4.ConditionTest.service.MyService;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();

		MyThreadA a = new MyThreadA(myService);
		a.start();

		MyThreadB b = new MyThreadB(myService);
		b.start();

	}
}
