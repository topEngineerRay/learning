package com.dr.mutiplethreads.chapter3.pipeInputOutput.test;

import com.dr.mutiplethreads.chapter3.pipeInputOutput.extthread.ThreadRead;
import com.dr.mutiplethreads.chapter3.pipeInputOutput.extthread.ThreadWrite;
import com.dr.mutiplethreads.chapter3.pipeInputOutput.service.ReadData;
import com.dr.mutiplethreads.chapter3.pipeInputOutput.service.WriteData;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class Run {

	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();

			// inputStream.connect(outputStream);
			outputStream.connect(inputStream);

			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();

			Thread.sleep(2000);

			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
