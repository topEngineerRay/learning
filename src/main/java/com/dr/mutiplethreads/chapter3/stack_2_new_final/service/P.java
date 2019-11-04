package com.dr.mutiplethreads.chapter3.stack_2_new_final.service;

import com.dr.mutiplethreads.chapter3.stack_2_new_final.entity.MyStack;

public class P {

	private MyStack myStack;

	public P(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void pushService() {
		myStack.push();
	}
}
