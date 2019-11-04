package com.dr.mutiplethreads.chapter3.pipeInputOutput.extthread;

import com.dr.mutiplethreads.chapter3.pipeInputOutput.service.WriteData;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {

	private WriteData write;
	private PipedOutputStream out;

	public ThreadWrite(WriteData write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}

	@Override
	public void run() {
		write.writeMethod(out);
	}

}
