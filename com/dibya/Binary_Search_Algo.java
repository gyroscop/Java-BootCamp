package com.dibya;

public class Binary_Search_Algo {

	public static void main(String[] args) {

		int[] arr = { -4, -3, 1, 3, 5, 8, 10 };
		int target = 78;

		int result = binarySearch(arr, target);

		System.out.print(result);

	}

	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		int mid = 0;

		while (start <= end) {

			mid = (int) (start + (end - start) / 2);

			if (arr[mid] == target) {
				System.out.println("The target is in " + (mid + 1) + " position");
				return (mid + 1);
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}

}
