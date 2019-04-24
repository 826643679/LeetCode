package com.luhao.Juesai;

import java.util.Arrays;
import java.util.List;


/**
 * 给定一个整数数组 A，返回满足下面条件的 非空、连续 子数组的数目：
 * 子数组中，最左侧的元素不大于其他元素。
 *
 * @since  2019年4月21日 下午4:05:57
 * @author luhao
 *
 */
public class ValidSubarrays {
	
	/**
	 * 先复制数组，排序后的数组不变，另一个数组每次减少一个元素（不排序）
	 * @param nums
	 * @return
	 */
	
    public static int validSubarrays(int[] nums) {
        int sum = 1;
        List list= Arrays.asList(nums);	//每次减少一个元素的数组
        int [] flag = nums;	//排序后的数组
        Arrays.sort(flag);
        for (int i = 0; i < nums.length; i++) {
        	if( flag[i]<=nums[i]){
        		sum=sum+flag.length-i-1;
        	}else{
        		sum++;
        	}
		}
        System.out.println(sum);
        return sum;
    }
	
    /**
     * 错误
     * @param args
     */
	public static void main(String[] args) {
		validSubarrays(new int[]{1,4,2,5,3});
		validSubarrays(new int[]{3,2,1});
		validSubarrays(new int[]{2,2,2});
		
	}

}
