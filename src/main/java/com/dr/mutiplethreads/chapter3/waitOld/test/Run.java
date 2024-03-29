package com.dr.mutiplethreads.chapter3.waitOld.test;

import com.dr.mutiplethreads.chapter3.waitOld.entity.Add;
import com.dr.mutiplethreads.chapter3.waitOld.entity.Subtract;
import com.dr.mutiplethreads.chapter3.waitOld.extthread.ThreadAdd;
import com.dr.mutiplethreads.chapter3.waitOld.extthread.ThreadSubtract;

public class Run {

	public static void main(String[] args) throws InterruptedException {

		String lock = new String("");

		Add add = new Add(lock);
		Subtract subtract = new Subtract(lock);

		ThreadSubtract subtract1Thread = new ThreadSubtract(subtract);
		subtract1Thread.setName("subtract1Thread");
		subtract1Thread.start();

		ThreadSubtract subtract2Thread = new ThreadSubtract(subtract);
		subtract2Thread.setName("subtract2Thread");
		subtract2Thread.start();

		Thread.sleep(1000);

		ThreadAdd addThread = new ThreadAdd(add);
		addThread.setName("addThread");
		addThread.start();

	}

}
