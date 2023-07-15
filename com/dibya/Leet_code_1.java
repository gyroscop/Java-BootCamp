//Given and Array 'nums' of integers, return how many of them contain an even number of digits

package com.dibya;

public class Leet_code_1 {

	/// approach_1

	/*
	 * public static void main(String[] args) { int[] nums = { 12, 345, 2, 65, 789
	 * };
	 * 
	 * int cou = evenDigits(nums);
	 * 
	 * System.out.print(cou); }
	 * 
	 * static int evenDigits(int[] arr) {
	 * 
	 * int evenDigits = 0;
	 * 
	 * for (int num : arr) { int count = 0;
	 * 
	 * while (num != 0) { num = num / 10; count = count + 1; }
	 * 
	 * if (count % 2 == 0) { evenDigits = evenDigits + 1; } }
	 * 
	 * return evenDigits; }
	 */

	/// approach_2

//	public static void main(String[] args) {
//		int[] nums = { 12, 345, 2, 65, 789 };
//
//		int cou = evenDigits(nums);
//
//		System.out.print(cou);
//	}
//
//	static int evenDigits(int[] arr) {
//
//		int evenDigits = 0;
//
//		for (int num : arr) {
//			int count = 0;
//
//			while (num != 0) {
//				num = num / 10;
//				count = count + 1;
//			}
//
//			if (count % 2 == 0) {
//				evenDigits = evenDigits + 1;
//			}
//		}
//
//		return evenDigits;
//	}

//	approach_3
	public static void main(String[] args) {
		int[] nums = { 12, 2, 21, 0, 789 };

		int cou = evenDigits(nums);

		System.out.print(cou);
	}

	static int evenDigits(int[] nums) {

		int count = 0;
		for (int num : nums) {
			if (even(num)) {
				count++;
			}
		}

		return count;
	}

	static boolean even(int num) {

		if (digit(num) % 2 == 0) {
			return true;
		}
		return false;
	}

//	static int digit(int num) {
//
//		int count = 0;
//
//		if (num < 0) {
//			num = num * (-1);
//		}
//		if (num == 0) {
//			return 1;
//		}
//		while (num != 0) {
//			num = num / 10;
//			count = count + 1;
//		}
//		return count;
//	}

//approach_3	
	static int digit(int num) {

		if (num < 0) {
			num = num * (-1);
		}
		if (num == 0) {
			return 1;
		}

		return (int) (Math.log10(num)) + 1;
	}
}
