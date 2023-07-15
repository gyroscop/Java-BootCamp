package com.dibya;

import java.util.Arrays;

public class RotatedSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int targetIndex = 3;

		int[] rotatedArray = rotate(arr, targetIndex);

		System.out.print(Arrays.toString(rotatedArray));

	}

	private static int[] rotate(int[] arr, int target) {

		for (int i = target; i < arr.length; i++) {
			arr[i - target] = arr[i];
		}
		;

		return arr;
	}

}
