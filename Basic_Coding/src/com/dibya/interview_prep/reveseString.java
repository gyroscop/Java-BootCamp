package com.dibya.interview_prep;

public class reveseString {

	public static void main(String[] args) {

		String str = "Dibya" ;
		String reverse = "";
		
		for (int i = 0 ;  i < str.length() ; i++ ) {
			reverse =  str.charAt(i) + reverse;
		}
		
		System.out.println(reverse);

}
}