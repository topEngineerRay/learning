package com.dr.mutiplethreads.chapter3.stack4.service;

import com.dr.mutiplethreads.chapter3.stack4.entity.MyStack;

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
