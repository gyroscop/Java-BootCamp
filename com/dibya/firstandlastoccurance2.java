package com.dibya;

import java.util.Arrays;

public class firstandlastoccurance2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5, 6, 7, 7, 7, 7, 8, 8, 9, 9, 10 };
		int[] result = firstAndlast(arr, 8);

		System.out.print(Arrays.toString(result));

	}

	public static int[] firstAndlast(int[] arr, int target) {

		int[] ans = { -1, -1 };

		ans[0] = search(arr, target, true);
		if (ans[0] != -1) {
			ans[1] = search(arr, target, false);
		}

		return ans;

	}

	private static int search(int[] arr, int target, boolean findStartIndex) {

		int ans = -1;
		int start = 0;
		int end = arr.length;

		while (start <= end) {
			int mid = (int) (start + (end - start) / 2);

			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				ans = mid;

				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}

}
