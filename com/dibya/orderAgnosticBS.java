package com.dibya;

public class orderAgnosticBS {

	public static void main(String[] args) {

//		int[] arr = { -4, -3, 1, 3, 5, 8, 10 };

		int[] arr = { 10, 7, 4, 5, 2, 1 };

		int target = 2;

		int result = orderAgnosticBS(arr, target);

		System.out.print(result);

	}

	static int orderAgnosticBS(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {

			int mid = (int) (start + (end - start) / 2);

			if (arr[mid] == target) {
				System.out.println("The target is in " + (mid + 1) + " position");
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

		return -1;

	}
}
