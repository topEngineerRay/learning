package com.dr.mutiplethreads.chapter2.setNewStringTwoLock;

public class MyService {
	private String lock = "123";

	public void testMethod() {
		try {
			synchronized (lock) {
				System.out.println(Thread.currentThread().getName() + " begin "
						+ System.currentTimeMillis());
				lock = "456";//改变了锁对象
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + "   end "
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
