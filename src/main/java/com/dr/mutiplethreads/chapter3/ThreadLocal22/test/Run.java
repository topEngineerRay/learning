package com.dr.mutiplethreads.chapter3.ThreadLocal22.test;

import com.dr.mutiplethreads.chapter3.ThreadLocal22.ext.ThreadLocalExt;

public class Run {
	public static ThreadLocalExt tl = new ThreadLocalExt();

	public static void main(String[] args) {
		if (tl.get() == null) {
			System.out.println("从未放过值ֵ");
			tl.set("我的值");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
