package com.dibya.singleton;

public class Main {

	public static void main(String[] args) throws Throwable {

		Singleton obj = Singleton.getInstance();
		System.out.println(obj.password);
//		
		Singleton obj1 = Singleton.finalize("Dibya@123");
		System.out.println(obj1.password);

		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2.password);

	}
}
