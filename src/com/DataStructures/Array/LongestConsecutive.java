package com.DataStructures.Array;

import java.util.Arrays;

/**
 * 128. 最长连续序列
 * 
 * @author Administrator
 *
 */
public class LongestConsecutive {

	public static int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length; // 数组长度
		if (len < 2) { // 特殊处理
			return len;
		}
		int p = 1; // 当前游标位置
		int max = 1; // 最大长度，最少为1
		int index = 0; // 连续序列起始位置
		while (p < len) {
			if (nums[p] - nums[p - 1] > 1) {
				index = p; // 重置连续序列起始位置
			}
			max = Math.max(max, nums[p] - nums[index] + 1);
			p++; // 游标自增
		}
		System.out.println(max);
		return max;
	}

	public static void main(String[] args) {
		longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 });
	}

}
