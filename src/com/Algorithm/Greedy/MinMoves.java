package com.Algorithm.Greedy;

import java.util.Arrays;

/**
 * 453. 最小移动次数使数组元素相等
 * @author Administrator
 *
 */

public class MinMoves {
	//n-1个数同时加一，就好比每次有一个数自身减一
	//数组最后的数为最小值
	//每个元素减去最小值，求和
	public static int minMoves(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			nums[i] = nums[i] - nums[0];
			res = res + nums[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		minMoves(num);
	}

}
