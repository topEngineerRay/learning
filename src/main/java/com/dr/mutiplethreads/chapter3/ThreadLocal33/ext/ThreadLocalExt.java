package com.dr.mutiplethreads.chapter3.ThreadLocal33.ext;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
