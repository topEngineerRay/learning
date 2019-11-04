package com.dr.mutiplethreads.chapter3.stack_1.test.run;

import com.dr.mutiplethreads.chapter3.stack_1.entity.MyStack;
import com.dr.mutiplethreads.chapter3.stack_1.extthread.C_Thread;
import com.dr.mutiplethreads.chapter3.stack_1.extthread.P_Thread;
import com.dr.mutiplethreads.chapter3.stack_1.service.C;
import com.dr.mutiplethreads.chapter3.stack_1.service.P;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C r = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread = new C_Thread(r);
		pThread.start();
		rThread.start();
	}

}
