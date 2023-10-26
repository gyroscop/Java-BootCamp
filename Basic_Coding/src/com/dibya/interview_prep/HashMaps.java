/*
 * 1.  Write a Java program to associate the specified value with the specified key in a HashMap.
 * 
 * 2.  Write a Java program to copy all mappings from the specified map to another map.
 * 
 * 3. Creating a Shallow Copy of Map
 * 
 * 
 */

package com.dibya.interview_prep;

import java.util.HashMap;
import java.util.HashSet;

public class HashMaps {

	public static void main(String[] args) {
		
		
		HashMap<String , Integer> marks = new HashMap<>();
		
		marks.put("Dibya", 99);
		marks.put("Rohan", 95);
		marks.put("Bhargav", 92);
		marks.put("Pabitra", 97);
		marks.put("Bedanta", 91);
		
//	    System.out.println(	marks.keySet() );
		
//		marks.put("Dibya", 100);
//		System.out.println(marks);
		
		
		/*
		 * 1
		for(@SuppressWarnings("rawtypes") Map.Entry x : marks.entrySet()) {
			
			System.out.println(x.getKey() + " : " + x.getValue());
		}
		*/
		
//		System.out.println(marks.size());
		
		
		/*
		 * 2
				HashMap<String , Integer> marks2 = new HashMap<>();
				
				marks2.put("Nilakshi", 99);
				marks2.put("Mainu", 95);
				marks2.put("Jina", 92);
				marks2.put("Priyam", 97);
				marks2.put("Dipika", 91);
				
				marks.putAll(marks2);
				System.out.println(marks);
		
		*/
		
		/*
		 */
		@SuppressWarnings("unchecked")
		HashMap<String , Integer> marks2 = (HashMap<String, Integer>) marks.clone();
		
		System.out.println(marks2);
		marks2.put("Dibya", 90);
		
//		marks.get("Dibya");
		System.out.println(marks);
		System.out.println(marks2);
		
	
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(null);
		
		
		
		
		
	}

}
