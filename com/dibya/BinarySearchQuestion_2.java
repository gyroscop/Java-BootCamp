/* floor of number 
 * 
 * arr = [10,2,4,8,3,34];
 * target = 4;
 * 
 * Step 1 : Sort the Array in Ascending order 
 * Step 2 : Find the ceiling of the target 
 * 
 * flooe of a target: equal or smaller than the target no. in a array
 * 
 * 
 * */

package com.dibya;

import java.util.Arrays;

public class BinarySearchQuestion_2 {

	public static void main(String args[]) {

		Integer[] arr = { 10, 2, 4, 8, 34 };
		int target = 3;

		int result = floor(arr, target);

		System.out.print(arr[result]);

	}

	private static int floor(Integer[] arr, int target) {

		Arrays.sort(arr);

		String sorted = Arrays.toString(arr);
		int start = 0;
		int end = arr.length - 1;

		/*
		 * while (end - start > 1) { int mid = (int) (start + (end - start) / 2);
		 * 
		 * if (arr[mid] == target) { return mid; } else { if (arr[mid] < target) {
		 * 
		 * start = mid; } else {
		 * 
		 * end = mid; } }
		 * 
		 * } return start;
		 */

		while (start <= end) {
			int mid = (int) (start + (end - start) / 2);

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}

		}
		return end;
	}
}
