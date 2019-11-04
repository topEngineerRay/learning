package com.dr.mutiplethreads.chapter1.t2;

public class Run {

	public static void main(String[] args) {
		Runnable runnable=new MyRunnable();
		//写一个类实现runnable接口，再把这个类的实例传入到Thread类的构造函数的参数当中
		//本质上两种实现多线程的方法都是一样的，因为事实上Thread类也实现了Runable接口并重写了run方法
		//自己实现和继承本质上都是一样的
		Thread thread=new Thread(runnable);
		//Thread的构造方法定义的参数类型是Runable接口，因此这里只需要传入他的实现类皆可，此处也是多态的一个应用
		thread.start();
		System.out.println("运行结束");
	}

}
