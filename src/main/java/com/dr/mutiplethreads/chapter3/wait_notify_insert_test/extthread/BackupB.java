package com.dr.mutiplethreads.chapter3.wait_notify_insert_test.extthread;

import com.dr.mutiplethreads.chapter3.wait_notify_insert_test.service.DBTools;

public class BackupB extends Thread {

	private DBTools dbtools;

	public BackupB(DBTools dbtools) {
		super();
		this.dbtools = dbtools;
	}

	@Override
	public void run() {
		dbtools.backupB();
	}

}
