package com.dr.mutiplethreads.chapter3.p_r_test.entity;

//������
public class P {

	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}

	public void setValue() {
		try {
			synchronized (lock) {
				if (!ValueObject.value.equals("")) {
					lock.wait();
				}
				String value = System.currentTimeMillis() + "_"
						+ System.nanoTime();
				System.out.println("set的值是" + value);
				ValueObject.value = value;
				lock.notify();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
