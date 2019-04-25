package com.luhao.Tanxin;

/**
 * 665. 非递减数列 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * 
 * @author Administrator
 *
 */
public class CheckPossibility {

	// 出现两次前面的数比后面的数大就返回false
	public boolean checkPossibility(int[] nums) {
		int cnt = 0;
		for (int i = 1; i < nums.length && cnt < 2; i++) {
			if (nums[i] >= nums[i - 1]) {
				continue;
			}
			cnt++;
			//考虑特殊情况 3，4，2，3
			if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
				nums[i] = nums[i - 1];
			} else {
				nums[i - 1] = nums[i];
			}
		}
		return cnt <= 1;
	}

	public static void main(String[] args) {

	}

}
