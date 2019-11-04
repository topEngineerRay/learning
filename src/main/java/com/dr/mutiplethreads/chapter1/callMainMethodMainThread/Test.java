package com.dr.mutiplethreads.chapter1.callMainMethodMainThread;

public class Test {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();
		System.out.println(Thread.currentThread().getStackTrace().toString());
/*
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getThreadGroup());*/

	}

}
