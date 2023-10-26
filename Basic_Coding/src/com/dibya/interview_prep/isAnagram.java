package com.dibya.interview_prep;

import java.util.Arrays;

public class isAnagram {

	public static void main(String[] args) {

		String str1 = "LISTEN";
		String str2 = "silent";
		
		
		isAnagram(str1,str2);

	}

	private static void isAnagram(String str1, String str2) {
		
		boolean anagramstat = false ;

		if (str1.length() != str2.length()) {
//			System.out.println("Strings are not Anagram");
			anagramstat = false ;
			
		}else {
			char[] strChar1= str1.toUpperCase().toCharArray();
			char[] strChar2= str2.toUpperCase().toCharArray();
			
//			System.out.println(strChar1);
//			System.out.println(strChar2);
			
			Arrays.sort(strChar1);
			Arrays.sort(strChar2);
			
//			System.out.println( strChar1);
//			System.out.println( strChar2);
			
			anagramstat = Arrays.equals(strChar1, strChar2);
			
			
			
		}
		
		if (anagramstat ==  true) {
			System.out.print(str1 + " and "+str2+ " are anagrams");
	
		}else {
			System.out.print(str1 + " and "+str2+ " are not anagrams");
		}
		
	}

}
