package com.luhao.Tanxin;

import java.util.Arrays;

public class FindKthLargest {
	
	
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(nums[nums.length-k]);
        return nums[nums.length-k];
    }
    
	public static void main(String[] args) {
		int[] nums1 = {3,2,1,5,6,4};
		int k1 = 2;
		int[] nums2 = {3,2,3,1,2,4,5,5,6};
		int k2 = 4;
		findKthLargest(nums1,k1);
		findKthLargest(nums2,k2);
	}

}
