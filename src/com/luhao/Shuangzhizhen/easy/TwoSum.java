package com.luhao.Shuangzhizhen.easy;

import java.util.Arrays;
/**
 * 167 双指针
 * 超时：慎用for循环
 * @author Administrator
 *
 */
public class TwoSum {
	
    public static int[] twoSum(int[] numbers, int target) {
    	int i = 0,j = numbers.length - 1;
    	while(i < j){
    		int sum = numbers[i] + numbers[j];
    		if(sum==target){
    			return new int[]{i+1,j+1};
    		}else if(sum<target){
    			i++;
    		}else{
    			j--;
    		}
    	}
    	return null;
    }
    
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		twoSum(numbers,9);
	}

}
