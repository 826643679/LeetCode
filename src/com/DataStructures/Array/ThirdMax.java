package com.DataStructures.Array;

/**
 * 414. 第三大的数 要求时间复杂度为O(n)
 * @author Administrator
 *
 */
public class ThirdMax {

    public static int thirdMax(int[] nums) {
    	 if(nums.length==1){		//只有一个元素时
             return nums[0];
         }
         if(nums.length==2){		//只有两个元素时
             return Math.max(nums[0],nums[1]);
         }
         int max1=Integer.MIN_VALUE;
         int max2=Integer.MIN_VALUE;
         int max3=Integer.MIN_VALUE;
         boolean f=true;
         int flag=0;
         for(int i=0;i<nums.length;i++){
        	 //越界数处理
             if(nums[i]==Integer.MIN_VALUE&&f){
                 flag++;
                 f=false;
             }
             if(nums[i]>max1){
                 flag++;
                 //原先第二大传递给第三大
                 max3=max2;
                 //原先最大值传递给第二大
                 max2=max1;
                 //更新最大值
                 max1=nums[i];
             }else if (nums[i]>max2 && nums[i]<max1){
                 flag++;
                 max3=max2;
                 max2=nums[i];
             } else if( nums[i]>max3 && nums[i]<max2){
                 flag++;
                 max3=nums[i];
             }
         }
         System.out.println(flag>=3?max3:max1);
         return flag>=3?max3:max1;
    }
    
	public static void main(String[] args) {
		thirdMax(new int []{3, 2, 1});	
		thirdMax(new int []{1,2,-2147483648});
	}

}
