package com.dr.mutiplethreads.chapter2.twoObjectTwoLock;

public class HasSelfPrivateNum {

	private int num = 0;

	synchronized public void addI(String username) {
		//synchronized取得的锁都是对象锁，而不是把一段代码或者方法当作锁，创建两个对象就会产生两个锁
		try {
			if (username.equals("a")) {
				num = 100;
				System.out.println("a set over!");
				Thread.sleep(2000);
			} else {
				num = 200;
				System.out.println("b set over!");
			}
			System.out.println(username + " num=" + num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
