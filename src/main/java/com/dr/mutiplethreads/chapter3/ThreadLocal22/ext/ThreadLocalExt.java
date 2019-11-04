package com.dr.mutiplethreads.chapter3.ThreadLocal22.ext;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return "我是默认值 第一次get不再为null";
	}
}
