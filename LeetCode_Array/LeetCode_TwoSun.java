package LeetCode_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_TwoSun {
	// Example:
	// Given nums = [2, 7, 11, 15], target = 9,
	// Because nums[0] + nums[1] = 2 + 7 = 9,
	// return [0, 1].
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] og = { 2, 7, 11, 15 };

		int target = 18;
		int[] result = two_sum(og, target);
		System.out.println("[" + result[0] + "," + result[1] + "]");
		
		

	}

	public static int[] two_sum(int[] array, int target) {
		int[] result = new int[2];
		int len = array.length;
		for (int j = len - 1; j >= 0; j--) {
			for (int i = 0; i < len; i++) {
				if ((array[i] + array[j]) == (target)) {
					result[0] = j;
					result[1] = i;
				}
			}
		}

		return result;
	}

}
