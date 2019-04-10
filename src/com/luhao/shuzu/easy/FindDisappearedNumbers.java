package com.luhao.shuzu.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 448. 找到所有数组中消失的数字
 * 将所有正数作为数组下标，置对应数组值为负值。那么，仍为正数的位置即为（未出现过）消失的数字。
 * 
 * @author Administrator
 */
public class FindDisappearedNumbers {
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
    	List<Integer> res = new ArrayList<>();
    	for (int i = 0; i < nums.length; i++) {
    		 nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
		}
    	
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i]>0) 	res.add(i+1);
		}
    	return res;
    }
    
    
	public static void main(String[] args) {
		int[] nums = {1,5,2,5,2,5};
		findDisappearedNumbers(nums);
	}

}
