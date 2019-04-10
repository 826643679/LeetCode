package com.luhao.shuzu.easy;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 * 类似归并，用nums2替换nums1中的0再排序
 * @author Administrator
 *
 */
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	int j = 0;	
        for (int i = 0; i < nums1.length; i++) {
				if(nums1[i]==0&&j<n){
					nums1[i]=nums2[j++];
				}
        }
        Arrays.sort(nums1);
        //System.out.println(Arrays.toString(nums1));
    }
	
	
	public static void main(String[] args) {
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int[] nums2 = {1,2,2};
		int m = 6,n = 3;
		merge(nums1,m,nums2,n);
	}
	
	
}
