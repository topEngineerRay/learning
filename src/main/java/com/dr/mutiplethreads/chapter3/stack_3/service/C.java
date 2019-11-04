package com.dr.mutiplethreads.chapter3.stack_3.service;

import com.dr.mutiplethreads.chapter3.stack_3.entity.MyStack;

public class C {

	private MyStack myStack;

	public C(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	public void popService() {
		System.out.println("pop=" + myStack.pop());
	}
}
