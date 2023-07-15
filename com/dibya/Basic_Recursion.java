package com.dibya;

public class Basic_Recursion {

	public static void main(String[] Args) {
		print(1);
	}

	public static void print(int i) {

		if (i == 5) {
			System.out.println(i);
			return;
		} // base statement

		System.out.println(i);
		print(i + 1);

	}

}
