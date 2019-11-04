package com.dr.mutiplethreads.chapter2.innerClass;

import com.dr.mutiplethreads.chapter2.innerClass.PublicClass.PrivateClass;

public class Run {

	public static void main(String[] args) {

		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");

		System.out.println(publicClass.getUsername() + " "
				+ publicClass.getPassword());

		PrivateClass privateClass = publicClass.new PrivateClass();
		privateClass.setAge("ageValue");
		privateClass.setAddress("addressValue");

		System.out.println(privateClass.getAge() + " "
				+ privateClass.getAddress());

	}

}
