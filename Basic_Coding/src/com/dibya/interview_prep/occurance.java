package com.dibya.interview_prep;

public class occurance {

	public static void main(String[] args) {
		
		String str = "Newzealand" ;
		char target = 'e';
		int count = 0;
		
		for (int i  = 0 ;  i< str.length() ; i ++) {
			
//			if (str.charAt(i) ==(target)) {
//				count ++ ;
//				
//			}
			
			Character c = str.charAt(i);
			
			if ( c.equals(target)) {
				count ++ ;
				
			}
			
		}
		
		 System.out.print("Number of Occurence of "+ target + " : " + count );

	}

}
