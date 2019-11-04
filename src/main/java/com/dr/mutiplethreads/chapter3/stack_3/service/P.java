package com.dr.mutiplethreads.chapter3.stack_3.service;

import com.dr.mutiplethreads.chapter3.stack_3.entity.MyStack;

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
