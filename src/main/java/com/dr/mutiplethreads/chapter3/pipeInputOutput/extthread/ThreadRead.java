package com.dr.mutiplethreads.chapter3.pipeInputOutput.extthread;

import com.dr.mutiplethreads.chapter3.pipeInputOutput.service.ReadData;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {

	private ReadData read;
	private PipedInputStream input;

	public ThreadRead(ReadData read, PipedInputStream input) {
		super();
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}
