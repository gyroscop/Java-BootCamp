package com.dibya;

public class ceiling {

	public static void main(String[] args) {

		int[] arr = { 10, 7, 5, 4, 2, 1 };

		int target = 6;

		int result = ceiling(arr, target);

		System.out.print(arr[result]);

	}

	static int ceiling(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {

			int mid = (int) (start + (end - start) / 2);

			if (arr[mid] == target) {

				return (mid + 1);
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;

				} else {
					start = mid + 1;
				}

			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}

		return start;
	}

//		Approach 2 Linear Search Alorithm
//
//		for (int i = 0; i <= arr.length; i++) {
//
//			if ((target <= arr[i]) && (target >= arr[i + 1])) {
//
//				return arr[i];
//
//			} else {
//				continue;
//			}
//
//		}
//
//		return -1;
//
//	}

}
