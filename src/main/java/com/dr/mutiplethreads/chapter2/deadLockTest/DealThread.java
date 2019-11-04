package com.dr.mutiplethreads.chapter2.deadLockTest;

public class DealThread implements Runnable {

	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public void setFlag(String username) {
		this.username = username;
	}

	@Override
	public void run() {
		if (username.equals("a")) {
			//取得了lock1的锁在等待lock2的锁
			synchronized (lock1) {
				try {
					System.out.println("username = " + username);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("按lock1->lock2代码顺序执行了");
				}
			}
		}
		if (username.equals("b")) {
			//取得了lock2的锁在等待lock1的锁
			synchronized (lock2) {
				try {
					System.out.println("username = " + username);
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("按lock2->lock1代码顺序执行了");
				}
			}
		}
	}

}