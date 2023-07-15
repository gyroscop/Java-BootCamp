/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.*/

package com.dibya;

public class leetcode_1672 {

	public static void main(String[] args) {

		int[][] case_1 = { { 1, 98, 10 }, { 3, 3, 1 } };

		int result = maxWealth(case_1);
		System.out.print(result);

	}

	/// approach_1
//	static int maxWealth(int[][] accounts) {
//
//		int max = Integer.MIN_VALUE;
//
//		for (int[] acc : accounts) {
//			if (sum_acc_balance(acc) > max) {
//				max = sum_acc_balance(acc);
//			}
//
//		}
//		return max;
//	}
//
//	static int sum_acc_balance(int[] acc) {
//
//		int wealth = 0;
//		for (int i = 0; i < acc.length; i++) {
//
//			wealth = wealth + acc[i];
//		}
//		return wealth;
//	}

	private static int maxWealth(int[][] accounts) {

		Integer max = Integer.MIN_VALUE;

		for (int[] person : accounts) {
			int sum = 0;

			for (int balance : person) {

				sum += balance;
			}
			if (sum > max) {
				max = sum;
			}
		}

		return max;
	}
}
