package com.Algorithm.BinarySearch;

/**
 * 540. 有序数组中的单一元素
 * 
 * @author Administrator
 *
 */
public class SingleNonDuplicate {

	/**
	 * 二分查找 当单个数在mid的右边并且mid为偶数且mid+1小于nums.length - 1，mid和mid+1元素相同
	 * 
	 * @param nums
	 * @return
	 */
	public int singleNonDuplicate(int[] nums) {
		int l = 0, r = nums.length - 1;
		while (l < r) {				//不能相等
			int mid = (l + r) / 2;
			if (mid % 2 == 1) {
				mid--;
			}
			if (nums[mid] == nums[mid + 1]) {
				l = mid + 2;
			} else {
				r = mid;
			}
		}
		return nums[l];
	}

	public static void main(String[] args) {

	}

}
