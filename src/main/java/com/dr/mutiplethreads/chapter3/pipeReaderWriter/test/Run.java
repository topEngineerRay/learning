package com.dr.mutiplethreads.chapter3.pipeReaderWriter.test;

import com.dr.mutiplethreads.chapter3.pipeReaderWriter.extthread.ThreadRead;
import com.dr.mutiplethreads.chapter3.pipeReaderWriter.extthread.ThreadWrite;
import com.dr.mutiplethreads.chapter3.pipeReaderWriter.service.ReadData;
import com.dr.mutiplethreads.chapter3.pipeReaderWriter.service.WriteData;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;


public class Run {

	public static void main(String[] args) {

		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();

			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();

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
