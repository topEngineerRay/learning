package com.dr.mutiplethreads.chapter2.t16;

public class RunThread extends Thread {

	volatile private boolean isRunning = true;
	//private boolean isRunning = true;//存在于公共堆栈及线程的私有堆栈中，server模式下，JVM为了线程运行的效率
	//一直在私有堆栈中取isRunning的值，然而thread.setRunning(false)虽然执行更新的确是公共堆栈中的isRunning的值为false

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	@Override
	public void run() {
		System.out.println("进入run了");
		while (isRunning == true) {
		}
		System.out.println("线程被停止了");
	}

}
