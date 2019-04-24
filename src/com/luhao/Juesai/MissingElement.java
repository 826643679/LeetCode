package com.luhao.Juesai;

/**
 * 给出一个有序数组 A，数组中的每个数字都是 独一无二的，找出从数组最左边开始的第 K 个缺失数字。
 *
 * @since  2019年4月21日 下午3:02:35
 * @author luhao
 *
 */
public class MissingElement {
	
	/**
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
    public static int missingElement(int[] nums, int k) {
        int a = nums[0] + k;
        int flag = 0;
        for (int i = 1; i < nums.length; i++) {
			if(nums[i]<a||nums[i]==a){
                flag++;
            }
		}
        return a+flag;
    }
    
    
	public static void main(String[] args) {
		//int[] nums = {4,7,9,10};
		int[] nums = {1,2,4};
		missingElement(nums,3);
	}

}
