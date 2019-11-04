package com.dr.mutiplethreads.chapter3.joinTest2.test;

import com.dr.mutiplethreads.chapter3.joinTest2.extthread.MyThread;

public class Test {

	public static void main(String[] args) {
		try {
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();//注意这里threadTest所属的线程是main线程

			System.out.println("���뵱threadTest����ִ����Ϻ�����ִ�У���������");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
