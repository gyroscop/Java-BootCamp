/* Find position of an element in an infinite array*/

package com.dibya;

public class findPositionInInfiniteArray {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 8, 9, 10, 48 };
		int target = 10;

		System.out.print(ans(arr, 48) + 1);
	}

	static int ans(int[] arr, int target) {

		int start = 0;
		int end = 1;

		while (target > arr[end]) {

			int new_start = end + 1;
			end = end + (end - start + 1) * 2;

			start = new_start;
		}

		return searchBinary(arr, target, start, end);

	}

	private static int searchBinary(int[] arr, int target, int start, int end) {

		while (start <= end) {

			int mid = (int) (start + (end - start) / 2);

			if (target > arr[mid]) {
				start = mid + 1;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
