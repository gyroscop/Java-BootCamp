/* 
 find the first and last occurrence of a number in an array of descending order
 
 eg : arr = {1,2,3,4,7,7,7,7,8,8,9,9}
 
 target  = 7
 
 first occurrence =  
 */

package com.dibya;

public class firstandlastoccurance {

	public static void main(String args[]) {

	}

	public int[] firstandlast(int[] nums, int target) {

		int[] ans = { -1, -1 };

		ans[0] = search(nums, target, true);

		if (ans[0] != -1) {
			ans[1] = search(nums, target, false);
		}

		return ans;

	}

	private int search(int[] nums, int target, boolean findStartIndex) {

		int ans = -1;

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {
			int mid = (int) (start + (start - end) / 2);

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
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
