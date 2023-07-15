package com.dibya;

public class binaryRecursion {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 7, 8 };
		int target = 5;
		int start = 0;
		int end = arr.length - 1;

		int result = BinarySearch(arr, target, start, end);

		System.out.println("The position of " + target + " is " + result + " from left");

	}

	private static int BinarySearch(int[] arr, int target, int start, int end) {

		if (start > end) {
			return -1;
		}

		int mid = (int) (start + (end - start) / 2);

		if (target == arr[mid]) {

			return mid;

		} else {

			if (target > arr[mid]) {
				start = mid + 1;
				return BinarySearch(arr, target, start, end);
			}
			if (target < arr[mid]) {
				end = mid - 1;
				return BinarySearch(arr, target, start, end);
			}
		}

		return -1;
	}

}
