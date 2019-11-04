package com.dr.mutiplethreads.chapter3.InheritableThreadLocal1.ext;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
