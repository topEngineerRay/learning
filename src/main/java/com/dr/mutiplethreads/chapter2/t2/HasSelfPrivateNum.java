package com.dr.mutiplethreads.chapter2.t2;

public class HasSelfPrivateNum {

	private int num = 0;

	synchronized public void addI(String username) {//同步
		//public void addI(String username) {//非同步
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
