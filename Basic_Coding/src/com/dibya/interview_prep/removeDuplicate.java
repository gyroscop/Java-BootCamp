package com.dibya.interview_prep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class removeDuplicate {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3 ,2, 5, 4, 5 ,6 , 7, 8 ,6} ;  
		
		
		
		for (int i = 0 ;  i < arr.length ; i++) {
			for (int n = i+1 ; n < arr.length ; n++) {
				if (arr[i] == arr[n]) {
					arr = removeDuplicateMethod(arr, n);
				}
			}
		}
		
		System.out.print("Modified Array : "+Arrays.toString(arr));
		

	}

	private static int[] removeDuplicateMethod(int[] arr, int n) {

		  // Create ArrayList from the array 
		 List<Integer> arrayList = IntStream.of(arr) 
                 .boxed() 
                 .collect(Collectors.toList()); 

		
		 arrayList.remove(n);
		 
		  // return the resultant array 
//	      return arrayList.stream() 
//	            .mapToInt(Integer::intValue) 
//	            .toArray();  

		  return arrayList.stream().mapToInt(Integer :: intValue).toArray();
		 
		
	}

}
