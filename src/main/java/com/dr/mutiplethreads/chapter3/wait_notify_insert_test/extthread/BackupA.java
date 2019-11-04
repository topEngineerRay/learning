package com.dr.mutiplethreads.chapter3.wait_notify_insert_test.extthread;

import com.dr.mutiplethreads.chapter3.wait_notify_insert_test.service.DBTools;

public class BackupA extends Thread {

	private DBTools dbtools;

	public BackupA(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}

	@Override
	public void run() {
		dbtools.backupA();
	}

}
