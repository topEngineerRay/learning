package com.dr.mutiplethreads.chapter3.wait_notify_insert_test.test.run;

import com.dr.mutiplethreads.chapter3.wait_notify_insert_test.extthread.BackupA;
import com.dr.mutiplethreads.chapter3.wait_notify_insert_test.extthread.BackupB;
import com.dr.mutiplethreads.chapter3.wait_notify_insert_test.service.DBTools;

public class Run {

	public static void main(String[] args) {
		DBTools dbtools = new DBTools();
		for (int i = 0; i < 20; i++) {
			BackupB output = new BackupB(dbtools);
			output.start();
			BackupA input = new BackupA(dbtools);
			input.start();
		}
	}

}
