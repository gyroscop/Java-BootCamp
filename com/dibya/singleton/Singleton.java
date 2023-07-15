package com.dibya.singleton;

public class Singleton {

	static String password = "Dibya@3188";

	private Singleton() {
		this.password = password;
	}

	private Singleton(String newPass) {
		this.password = newPass;
		Singleton.password = newPass;
	}

	private static Singleton Instance;

	public static Singleton getInstance() {

		if (Instance == null) {
			Instance = new Singleton();
		}

		return Instance;

	}

	protected static Singleton finalize(String NewPass) throws Throwable {
		System.out.println("Password Deleted");

		Singleton newPassword = new Singleton(NewPass);
		return newPassword;

	}
}
