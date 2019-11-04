package com.dr.mutiplethreads.chapter1.countPriority;

public class Run {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();

			ThreadB b = new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();

			Thread.sleep(20000);
			a.stop();
			b.stop();

			System.out.println("a=" + a.getCount());
			System.out.println("b=" + b.getCount());
			//b的count会更大,运行更快，因为b的优先级更高证明优先级高的运行更快
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
