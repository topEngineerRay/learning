package com.dr.mutiplethreads.chapter3.stack_2_new_final.service;

import com.dr.mutiplethreads.chapter3.stack_2_new_final.entity.MyStack;

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
