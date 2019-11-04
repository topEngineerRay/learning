package com.dr.mutiplethreads.chapter3.p_r_allWait_fix.entity;

//消费者
public class C {

	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}

	public void getValue() {
		try {
			synchronized (lock) {
				while (ValueObject.value.equals("")) {
					System.out.println("消费者 "
							+ Thread.currentThread().getName() + " WAITING了☆");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName()
						+ " RUNNABLE了");
				ValueObject.value = "";
				lock.notifyAll();//最大的区别在这
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
