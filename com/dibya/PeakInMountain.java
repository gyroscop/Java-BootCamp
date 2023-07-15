package com.dibya;

public class PeakInMountain {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 8, 6, 4, 2 };

		int result = peakInMountainArray(arr);

		System.out.print(result + 1);
	}

	private static int peakInMountainArray(int[] arr) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (int) (start + (end - start) / 2);

			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}

		return start;
	}

}
