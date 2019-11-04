package com.dr.mutiplethreads.chapter2.synBlockString;

public class Service {

	private String usernameParam;
	private String passwordParam;
	//String anyString = new String();//排队进入

	public void setUsernamePassword(String username, String password) {
		try {
			String anyString = new String();//一起进入一起离开
			synchronized (anyString) {
				System.out.println("线程名称为" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("线程名称为" + Thread.currentThread().getName()
						+ "在" + System.currentTimeMillis() + "离开同步块");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
