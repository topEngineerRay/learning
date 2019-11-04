package com.dr.mutiplethreads.chapter3.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private List list = new ArrayList();

	public void add() {
		list.add("丁睿");
	}

	public int size() {
		return list.size();
	}

}
