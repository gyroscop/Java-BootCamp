//
//You are given an array of characters letters that is sorted in non-decreasing order,and a character target.There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target.If such a character does not exist,return the first character in letters.

package com.dibya;

public class BinarySearchQuestion_3 {

	public static void main(String Args[]) {

		char[] letters = { 'a', 'b', 'c', 'd' };
		char target = 'c';

		char result = nextGreatestLetter(letters, target);
		System.out.print(result);

	}

	public static char nextGreatestLetter(char[] letters, char target) {

		int start = 0;
		int end = letters.length - 1;

		while (start <= end) {
			int mid = (int) (start + (end - start) / 2);

			if (target < letters[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return letters[start % letters.length];
	}

}
