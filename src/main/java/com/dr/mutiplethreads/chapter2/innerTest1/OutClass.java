package com.dr.mutiplethreads.chapter2.innerTest1;

public class OutClass {

	static class Inner {
		public void method1() {
			synchronized ("其他的锁") {//锁了一个String
				for (int i = 1; i <= 10; i++) {
					System.out.println(Thread.currentThread().getName() + " i="
							+ i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
				}
			}
		}

		public synchronized void method2() {
			for (int i = 11; i <= 20; i++) {
				System.out
						.println(Thread.currentThread().getName() + " i=" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
	}
}
