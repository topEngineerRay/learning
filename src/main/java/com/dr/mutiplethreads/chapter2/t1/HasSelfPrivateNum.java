package com.dr.mutiplethreads.chapter2.t1;

public class HasSelfPrivateNum {

	public void addI(String username) {
		try {
			int num = 0;
			//永远都是线程安全的
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
