package com.dibya.interview_prep;

public class swap_without_third_var {

	public static void main(String[] args) {
		
		
		int a = 5  ;
		int b = 7 ;
		
		swap(a,b);
		
		
		

	}

	private static void swap(int a, int b) {

		b  = a+b;
		a = b-a;
		b = b-a;
		
		System.out.println( "a :" + a);
		System.out.println( "b :" + b);
		
		
	}

}
