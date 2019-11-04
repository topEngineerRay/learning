package com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyError.test;

import com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyError.extthread.ThreadA;
import com.dr.mutiplethreads.chapter4.UseConditionWaitNotifyError.service.MyService;

public class Run {

	public static void main(String[] args) {

		MyService service = new MyService();

		ThreadA a = new ThreadA(service);
		a.start();

	}

}
