// find fibonacci number at any give position

package com.dibya;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		System.out.println(fibo(input - 1));

	}

	static int fibo(int i) {

		if (i < 2) {
			return i;
		}

		return fibo(i - 1) + fibo(i - 2);
	}

}
