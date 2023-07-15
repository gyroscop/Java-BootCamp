package com.dibya;

import java.util.Arrays;

public class BubbleSortAlgo {

	public static void main(String[] arg) {

		int[] arr = { 3, 1, 5, 4, 2, 0 };
		int count = 0;

		/*
		 * int[] arr2 = { 1, 2, 3, 4, 5 };
		 * 
		 * System.out.println(isSorted(arr2));
		 */

		while (isSorted(arr) == false) {

			bubbleSort(arr, count);

			count++;

			System.out.println(count);
		}

		System.out.println(Arrays.toString(arr));

	}

	private static boolean isSorted(int[] arr) {

		for (int i = 0; i <= arr.length - 2; i++) {

			if (arr[i] > arr[i + 1])
				return false;

		}
		return true;
	}

	private static int[] bubbleSort(int[] arr, int i) {

		for (int j = 1; j <= arr.length - (i + 1); j++) {

			if (arr[j] < arr[j - 1]) {

				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;

			}
		}

		return arr;
	}
}
