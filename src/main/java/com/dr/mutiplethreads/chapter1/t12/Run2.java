package com.dr.mutiplethreads.chapter1.t12;


public class Run2 {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		//这里终端的是main线程，所以第一个会返回true
		System.out.println("is 1 stopped? = " + Thread.interrupted());
		System.out.println("is 2 stopped? = " + Thread.interrupted());
		//但是第二个interrupted返回的是false，原因在于调用interrupted方法之后，线程的中断状态会被清除
		System.out.println("end!");
	}
}
