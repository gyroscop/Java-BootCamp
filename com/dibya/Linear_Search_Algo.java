package com.dibya;

public class Linear_Search_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num[] = { 1, 2, 34, 5, -1, -3 };
//
//		int target = 3;
//
//		String name = "Dibya";
//		char c = 'D';

//		boolean result = linearSearchBoolean(num, target);
//		System.out.println(result);

//		if (result == -1) {
//			System.out.println(result);
//		} else {
//			System.out.println(result + 1);
//		}

//		boolean result = StringSearchBool(name, c);
//		System.out.println(result);

		int arr[][] = { { 1, 2, 5 }, { 4, 7, 9 }, { 3, 100, 11 } };

//		int target = 10;
//		int ans[] = SearchIn2DArray(arr, target);
//		System.out.print(Arrays.toString(ans));

		int ans = maxElement(arr);
		System.out.print(ans);

	}

	static int linearSearchIndex(int arr[], int target) {

		if (arr.length == 0) {
			return -1;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return index;
			}
		}

		return -1;

	}

	static int linearSearchElement(int arr[], int target) {

		if (arr.length == 0) {
			return Integer.MIN_VALUE;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return element;
			}
		}

		return Integer.MIN_VALUE;

	}

	static boolean linearSearchBoolean(int arr[], int target) {

		if (arr.length == 0) {
			return false;
		}
		for (int index = 0; index < arr.length; index++) {
			int element = arr[index];
			if (element == target) {
				return true;
			}
		}

		return false;

	}

	static boolean StringSearchBool(String str, char target) {

		if (str.length() == 0) {
			return false;
		}
		for (int index = 0; index < str.length(); index++) {
			int element = str.charAt(index);
			if (element == target) {
				return true;
			}
		}

		return false;

	}

	static int[] SearchIn2DArray(int[][] arr, int target) {

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] == target) {
					return new int[] { row, col };
				}
			}
		}

		return new int[] { -1, -1 };
	}

	static int maxElement(int[][] arr) {

		int max = Integer.MIN_VALUE;

		for (int[] ints : arr) {
			for (int element : ints) {
				if (element > max) {
					max = element;
				}
			}
		}

		return max;

	}
}
