package com.dibya.interview_prep;

public class factorial {

	public static void main(String[] args) {
		
		int number = 3 ;
		
		System.out.print(factorial(number));
		
	}

	private static int factorial(int i) {
		
		if (i==1) {
			return 1;
		}else {
		
		return i*(factorial(i-1));
		}
	}
	
	

}
