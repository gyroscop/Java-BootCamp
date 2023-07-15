
/* Ceiling of number 
 * 
 * arr = [10,2,4,8,3,34];
 * target = 4;
 * 
 * Step 1 : Sort the Array in Ascending order 
 * Step 2 : Find the ceiling of the target 
 * 
 * ceiling of a target: equal or greater than the target no. in a array
 * 
 * 
 * */

package com.dibya;

import java.util.Arrays;
//import java.util.Collections;

public class BinarySearchQuestion_1 {

	public static void main(String args[]) {

		Integer[] arr = { 10, 2, 4, 8, 3, 34 };
		int target = 9;

		int result = Ceiling(arr, target);

		System.out.print(arr[result]);

	}

	private static int Ceiling(Integer[] arr, int target) {

		Arrays.sort(arr);

		String sorted = Arrays.toString(arr);
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (int) (start + (end - start) / 2);

			if (arr[mid] == target) {
				return mid;
			} else {
				if (target > arr[mid]) {
					start = mid + 1;
				} else if (target < arr[mid]) {
					end = mid - 1;
				} else {
					return mid;
				}

			}

		}
		return start;
	}

}
