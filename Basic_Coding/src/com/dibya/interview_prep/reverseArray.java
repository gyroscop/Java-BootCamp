package com.dibya.interview_prep;

import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,8,9 };
		
		for (int i = 0 ; i < arr.length/2 ; i++) {
			int tmp = arr[i];
			 arr[i] = arr[arr.length-i-1];
			 arr[arr.length-i-1] = tmp;
			
			
		}
	System.out.print(Arrays.toString(arr));

	}

}
