package com.dibya.interview_prep;

public class isPalindromic {

	public static void main(String[] args) {
		
		String  str = "Boob";
		String reverse =  "";
		
		for(int i = 0  ; i< str.length() ;  i ++) {
			reverse  = str.charAt(i) +  reverse;
		}
		
		if (str.toUpperCase().equals(reverse.toUpperCase()) ) {
			System.out.println(str + " is palindromic");
		}else {
			System.out.println(str + " is not palindromic");
		}

	}

}
