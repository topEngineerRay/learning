package com.dr.mutiplethreads.chapter2.synBlockString2;

public class Service {

	private String anyString = new String();

	public void a() {
		try {
			synchronized (anyString) {
				//synchronized(非this对象)与同步synchronized方法是异步调用
				System.out.println("a begin");
				Thread.sleep(3000);
				System.out.println("a   end");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized public void b() {
		System.out.println("b begin");
		System.out.println("b   end");
	}

}
