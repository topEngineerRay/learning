package com.dr.mutiplethreads.chapter3.pipeReaderWriter.extthread;

import com.dr.mutiplethreads.chapter3.pipeReaderWriter.service.ReadData;

import java.io.PipedReader;


public class ThreadRead extends Thread {

	private ReadData read;
	private PipedReader input;

	public ThreadRead(ReadData read, PipedReader input) {
		super();
		this.read = read;
		this.input = input;
	}

	@Override
	public void run() {
		read.readMethod(input);
	}
}
