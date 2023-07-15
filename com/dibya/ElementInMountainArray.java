package com.dibya;

public class ElementInMountainArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 8, 6, 4, 2 };

		int target = 8;

		int peak = peakInMountainArray(arr);

		int resultAsc = MountainElementAsc(arr, peak, target);

		if (resultAsc != -1) {
			System.out.print(resultAsc);
		} else {
			int resultDesc = MountainElementDesc(arr, peak, target);
			System.out.print(resultDesc);
		}

	}

	private static int MountainElementDesc(int[] arr, int peak, int target) {
		int end = arr.length - 1;

		while (peak <= end) {

			int mid = (int) (peak + (end - peak) / 2);

			if (arr[mid] < target) {

				end = mid - 1;

			} else if (arr[mid] > target) {
				peak = mid + 1;
			} else {
				return mid;
			}

		}

		return -1;

	}

	private static int MountainElementAsc(int[] arr, int peak, int target) {

		int start = 0;

		while (start <= peak) {

			int mid = (int) (start + (peak - start) / 2);

			if (arr[mid] < target) {
				start = mid + 1;
			} else if (arr[mid] > target) {
				peak = mid - 1;
			} else {
				return mid;
			}

		}

		return -1;
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
